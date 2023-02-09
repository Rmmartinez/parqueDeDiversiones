package com.example.parquedediversiones.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    private static final int DataBase_Version = 1;
    private static final String DataBase_Nombre = "juegos";
    public static final String tabla_juego = "t_juego";


    public DbHelper(@Nullable Context context) {
        super(context, DataBase_Nombre, null, DataBase_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + tabla_juego +"(" +
                "nombreJuego TEXT not null," +
                "nombreJugador TEXT not null," +
                "complejidad TEXT not null," +
                "nivel TEXT not null," +
                "puntaje FLOAT not null)" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
