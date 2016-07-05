package com.example.aazarjameeel.habittrackerapp;

import android.provider.BaseColumns;

/**
 * Created by aazarjameeel on 04-Jul-16.
 */


public class HabitContract {

    public HabitContract(){}

    public static abstract class HabitEntry implements BaseColumns{
        public static final String TABLE_NAME = "habits";
        public static final String ID = "ID";
        public static final String NAME = "habitName";
    }
}


