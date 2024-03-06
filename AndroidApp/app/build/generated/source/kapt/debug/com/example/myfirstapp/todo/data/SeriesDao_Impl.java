package com.example.myfirstapp.todo.data;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class SeriesDao_Impl implements SeriesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Series> __insertionAdapterOfSeries;

  private final EntityDeletionOrUpdateAdapter<Series> __updateAdapterOfSeries;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  private final SharedSQLiteStatement __preparedStmtOfDeleteById;

  public SeriesDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSeries = new EntityInsertionAdapter<Series>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `Series` (`_id`,`title`,`episodes`,`date`,`available`,`imageUrl`,`requiresCreate`,`requiresUpdate`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Series entity) {
        if (entity.get_id() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.get_id());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        statement.bindLong(3, entity.getEpisodes());
        if (entity.getDate() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getDate());
        }
        final int _tmp = entity.getAvailable() ? 1 : 0;
        statement.bindLong(5, _tmp);
        if (entity.getImageUrl() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getImageUrl());
        }
        final int _tmp_1 = entity.getRequiresCreate() ? 1 : 0;
        statement.bindLong(7, _tmp_1);
        final int _tmp_2 = entity.getRequiresUpdate() ? 1 : 0;
        statement.bindLong(8, _tmp_2);
      }
    };
    this.__updateAdapterOfSeries = new EntityDeletionOrUpdateAdapter<Series>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `Series` SET `_id` = ?,`title` = ?,`episodes` = ?,`date` = ?,`available` = ?,`imageUrl` = ?,`requiresCreate` = ?,`requiresUpdate` = ? WHERE `_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Series entity) {
        if (entity.get_id() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.get_id());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        statement.bindLong(3, entity.getEpisodes());
        if (entity.getDate() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getDate());
        }
        final int _tmp = entity.getAvailable() ? 1 : 0;
        statement.bindLong(5, _tmp);
        if (entity.getImageUrl() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getImageUrl());
        }
        final int _tmp_1 = entity.getRequiresCreate() ? 1 : 0;
        statement.bindLong(7, _tmp_1);
        final int _tmp_2 = entity.getRequiresUpdate() ? 1 : 0;
        statement.bindLong(8, _tmp_2);
        if (entity.get_id() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.get_id());
        }
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM Series";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM Series WHERE _id == ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Series series) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSeries.insert(series);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Series series) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfSeries.handle(series);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clear() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfClear.release(_stmt);
    }
  }

  @Override
  public void deleteById(final String id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteById.acquire();
    int _argIndex = 1;
    if (id == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, id);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteById.release(_stmt);
    }
  }

  @Override
  public List<Series> getAll() {
    final String _sql = "SELECT * FROM Series";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfEpisodes = CursorUtil.getColumnIndexOrThrow(_cursor, "episodes");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "available");
      final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
      final int _cursorIndexOfRequiresCreate = CursorUtil.getColumnIndexOrThrow(_cursor, "requiresCreate");
      final int _cursorIndexOfRequiresUpdate = CursorUtil.getColumnIndexOrThrow(_cursor, "requiresUpdate");
      final List<Series> _result = new ArrayList<Series>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Series _item;
        final String _tmp_id;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmp_id = null;
        } else {
          _tmp_id = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final int _tmpEpisodes;
        _tmpEpisodes = _cursor.getInt(_cursorIndexOfEpisodes);
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final boolean _tmpAvailable;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfAvailable);
        _tmpAvailable = _tmp != 0;
        final String _tmpImageUrl;
        if (_cursor.isNull(_cursorIndexOfImageUrl)) {
          _tmpImageUrl = null;
        } else {
          _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
        }
        final boolean _tmpRequiresCreate;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfRequiresCreate);
        _tmpRequiresCreate = _tmp_1 != 0;
        final boolean _tmpRequiresUpdate;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfRequiresUpdate);
        _tmpRequiresUpdate = _tmp_2 != 0;
        _item = new Series(_tmp_id,_tmpTitle,_tmpEpisodes,_tmpDate,_tmpAvailable,_tmpImageUrl,_tmpRequiresCreate,_tmpRequiresUpdate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Series> getById(final String id) {
    final String _sql = "SELECT * FROM Series WHERE _id == ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfEpisodes = CursorUtil.getColumnIndexOrThrow(_cursor, "episodes");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "available");
      final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
      final int _cursorIndexOfRequiresCreate = CursorUtil.getColumnIndexOrThrow(_cursor, "requiresCreate");
      final int _cursorIndexOfRequiresUpdate = CursorUtil.getColumnIndexOrThrow(_cursor, "requiresUpdate");
      final List<Series> _result = new ArrayList<Series>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Series _item;
        final String _tmp_id;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmp_id = null;
        } else {
          _tmp_id = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final int _tmpEpisodes;
        _tmpEpisodes = _cursor.getInt(_cursorIndexOfEpisodes);
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final boolean _tmpAvailable;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfAvailable);
        _tmpAvailable = _tmp != 0;
        final String _tmpImageUrl;
        if (_cursor.isNull(_cursorIndexOfImageUrl)) {
          _tmpImageUrl = null;
        } else {
          _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
        }
        final boolean _tmpRequiresCreate;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfRequiresCreate);
        _tmpRequiresCreate = _tmp_1 != 0;
        final boolean _tmpRequiresUpdate;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfRequiresUpdate);
        _tmpRequiresUpdate = _tmp_2 != 0;
        _item = new Series(_tmp_id,_tmpTitle,_tmpEpisodes,_tmpDate,_tmpAvailable,_tmpImageUrl,_tmpRequiresCreate,_tmpRequiresUpdate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
