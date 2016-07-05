package com.example.aazarjameeel.habittrackerapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by aazarjameeel on 03-Jul-16.
 */
public class DbHandler extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 3;
    public static final String DATABASE_NAME = "HabitDB.db";

    public DbHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + HabitContract.HabitEntry.TABLE_NAME + " (" +
                        HabitContract.HabitEntry.ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        HabitContract.HabitEntry.NAME + " TEXT" + ")";
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + HabitContract.HabitEntry.TABLE_NAME;
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);

    }

    //deletes database
    public void deleteDB(Context context) {
        context.deleteDatabase(DATABASE_NAME);
    }

}
