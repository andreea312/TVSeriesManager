import Router from "koa-router";
import dataStore from "nedb-promise";
import { broadcast } from "./wss.js";
import { v4 as uuidv4 } from 'uuid';

export class ItemStore {
  constructor({ filename, autoload }) {
    this.store = dataStore({ filename, autoload });
  }

  async find(props) {
    return this.store.find(props);
  }

  async findOne(props) {
    return this.store.findOne(props);
  }

  async insert(series) {
    delete series._id;
    if (!series.title) {
      throw new Error("Missing title!");
    }
    return this.store.insert(series);
  }

  async update(props, item) {
    return this.store.update(props, item);
  }

  async remove(props) {
    return this.store.remove(props);
  }
}

const itemStore = new ItemStore({
  filename: "./db/items.json",
  autoload: true,
});

export const itemRouter = new Router();

itemRouter.get("/", async (ctx) => {
  const userId = ctx.state.user._id;
  console.log("here");
  ctx.response.body = await itemStore.find({ userId });
  ctx.response.status = 200; // ok
});

itemRouter.get("/:id", async (ctx) => {
  const userId = ctx.state.user._id;
  const item = await noteStore.findOne({ _id: ctx.params.id });
  const response = ctx.response;
  if (item) {
    if (item.userId === userId) {
      ctx.response.body = item;
      ctx.response.status = 200; // ok
    } else {
      ctx.response.status = 403; // forbidden
    }
  } else {
    ctx.response.status = 404; // not found
  }
});

// Function to generate a unique ID
const generateUniqueId = () => {
  return uuidv4();
};

const createItem = async (ctx, series, response) => {
  try {
    const userId = ctx.state.user._id;
    console.log(userId);
    series._id = generateUniqueId();
    series.userId = userId;
    series.isNotSaved = false;
    response.body = await itemStore.insert(series);
    console.log(response.body);
    response.status = 201; // created
    broadcast(userId, {
      event: "created",
      payload: { updatedSeries: response.body },
    });
  } catch (err) {
    console.log("here");
    console.log(err);
    response.body = { message: err.message };
    response.status = 400; // bad request
  }
};

itemRouter.post(
  "/",
  async (ctx) => await createItem(ctx, ctx.request.body, ctx.response)
);

itemRouter.put("/:id", async (ctx) => {
  const series = ctx.request.body;
  const id = ctx.params.id;
  const seriesId = series._id;
  const response = ctx.response;
  if (seriesId && seriesId !== id) {
    response.body = { message: "Param id and body _id should be the same" };
    response.status = 400; // bad request
    return;
  }
  if (!seriesId) {
    await createItem(ctx, series, response);
  } else {
    const userId = ctx.state.user._id;
    series.userId = userId;
    const updatedCount = await itemStore.update({ _id: id }, series);
    if (updatedCount === 1) {
      response.body = series;
      response.status = 200; // ok
      series.isNotSaved = false;
      broadcast(userId, {
        event: "updated",
        payload: { successMessage: "Updated series!", updatedSeries: series },
      });
    } else {
      response.body = { message: "Resource no longer exists" };
      response.status = 405; // method not allowed
    }
  }
});

itemRouter.del("/:id", async (ctx) => {
  const userId = ctx.state.user._id;
  const item = await itemStore.findOne({ _id: ctx.params.id });
  if (item && userId !== item.userId) {
    ctx.response.status = 403; // forbidden
  } else {
    await itemStore.remove({ _id: ctx.params.id });
    ctx.response.status = 204; // no content
    broadcast(userId, { event: "deleted", payload: { updatedSeries: item } });
  }
});
