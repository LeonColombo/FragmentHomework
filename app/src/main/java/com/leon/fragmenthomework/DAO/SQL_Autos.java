package com.leon.fragmenthomework.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import com.leon.fragmenthomework.Models.Auto;

import java.util.ArrayList;

public class SQL_Autos extends SQLiteOpenHelper {

    private Context context;
    private SQLiteDatabase conexion;
    private ArrayList<Auto> autoArrayList;

    private static final String DB_NAME ="AUTOS";
    private static final Integer DB_VERSION =1;

    public SQL_Autos(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    String query = "CREATE TABLE `AUTOS` ( `ID` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, `MARCA` TEXT NOT NULL, `MODELO` TEXT NOT NULL, `ANIO` INTEGER NOT NULL, `CARACTERISTICAS` TEXT )";
    sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    private void conectar() {conexion = getWritableDatabase();}
    private void desconectar(){conexion.close();}


    public void guardarAuto(Auto auto) {
        this.conectar();
        ContentValues fila = new ContentValues();

        fila.put("MARCA",auto.getMarca());
        fila.put("MODELO", auto.getModelo());
        fila.put("ANIO",auto.getAnio());

        conexion.insert("AUTOS", null,fila);
        this.desconectar();

    }

    public ArrayList<Auto> obtenerAuto() { //para levantar lo que se guardo en la base de datos
             autoArrayList = new ArrayList<>();
             this.conectar();
             String query = "";
             query = "select MARCA, MODELO, ANIO, ID from AUTOS";
             Cursor cursor = conexion.rawQuery(query, null);
             while (cursor.moveToNext()) {
             Auto unAuto = new Auto(cursor.getString(cursor.getColumnIndex("MARCA")), cursor.getString(cursor.getColumnIndex("MODELO")),
                           cursor.getInt(cursor.getColumnIndex("ANIO")), cursor.getInt(cursor.getColumnIndex("ID")));

                 autoArrayList.add(unAuto);

             }
             return autoArrayList;
         }
}
