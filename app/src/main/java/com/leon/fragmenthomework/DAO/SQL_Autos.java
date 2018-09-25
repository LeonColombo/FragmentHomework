package com.leon.fragmenthomework.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQL_Autos extends SQLiteOpenHelper {

    private Context context;
    private SQLiteDatabase conexion;
    private ArrayList<Auto> autoArrayList;

    private static final String DB_NAME ="AUTO";
    private static final Integer DB_VERSION =1;

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
