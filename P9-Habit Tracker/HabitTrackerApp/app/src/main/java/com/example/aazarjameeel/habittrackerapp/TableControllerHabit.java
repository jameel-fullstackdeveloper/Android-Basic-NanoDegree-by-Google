package com.example.aazarjameeel.habittrackerapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aazarjameeel on 03-Jul-16.
 */
public class TableControllerHabit extends DbHandler {

    public TableControllerHabit(Context context) {
        super(context);
    }


    /*insert the record to database*/
    public boolean insert(Habit objHabit) {

        ContentValues values = new ContentValues();

        values.put("habitName", objHabit.habitName);

        SQLiteDatabase db = this.getWritableDatabase();

        boolean insertSuccessful = db.insert("habits", null, values) > 0;
        db.close();

        return insertSuccessful;
    }

    /*total records count */
    public int count() {

        SQLiteDatabase db = this.getWritableDatabase();

        String sql = "SELECT * FROM habits";
        int recordCount = db.rawQuery(sql, null).getCount();
        db.close();

        return recordCount;

    }

    /*read data the database*/
    public List<Habit> read() {

        List<Habit> recordsList = new ArrayList<Habit>();

        String sql = "SELECT * FROM habits ORDER BY ID DESC";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {

                int id = Integer.parseInt(cursor.getString(cursor.getColumnIndex("ID")));
                String habitName = cursor.getString(cursor.getColumnIndex("habitName"));

                Habit objHabit = new Habit();
                objHabit.id = id;
                objHabit.habitName = habitName;

                recordsList.add(objHabit);

            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return recordsList;
    }


    /*update record*/
    public boolean update(Habit objHabit) {

        ContentValues values = new ContentValues();

        values.put("habitName", objHabit.habitName);

        String where = "ID = ?";

        String[] whereArgs = { Integer.toString(objHabit.id) };

        SQLiteDatabase db = this.getWritableDatabase();

        boolean updateSuccessful = db.update("habits", values, where, whereArgs) > 0;
        db.close();

        return updateSuccessful;

    }

    /*get gabit as cursor*/
    public Cursor getHabits()
    {
        Cursor cursor = getReadableDatabase().query("habits",
                new String[] { "ID", "habitName"},
                null, null, null, null, null);
        return cursor;
    }

    /*delete all records*/
    public void deleteAll()
    {
        getWritableDatabase().delete("habits", null, null);
    }


    /*Delete record*/
    public boolean delete(int id) {
        boolean deleteSuccessful = false;

        SQLiteDatabase db = this.getWritableDatabase();
        deleteSuccessful = db.delete("habits", "ID ='" + id + "'", null) > 0;
        db.close();

        return deleteSuccessful;

    }



}
