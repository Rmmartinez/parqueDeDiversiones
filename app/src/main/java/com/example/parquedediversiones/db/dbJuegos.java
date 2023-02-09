package com.example.parquedediversiones.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.example.parquedediversiones.entidades.jugador;

import java.util.ArrayList;

public class dbJuegos extends DbHelper{

    Context context;
    long id=0;

    public dbJuegos(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertar(String nombrejuego, String nombre, String complejidad, String nivel, float puntaje){
        try {
            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();
            ContentValues values = new ContentValues();

            values.put("nombreJuego", nombrejuego);
            values.put("nombreJugador", nombre);
            values.put("complejidad", complejidad);
            values.put("nivel", nivel);
            values.put("puntaje", puntaje);

            id = db.insert(tabla_juego, null, values);
        }catch (Exception ex){
            ex.toString();
        }
        return id;
    }

    public ArrayList<jugador> mostrarJugadores(String nombreJuego){
        DbHelper dbHelper = new DbHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ArrayList<jugador> listaJugadores = new ArrayList<>();
        jugador jugador = null;
        Cursor cursorJugador = null;
        try {


            cursorJugador = db.rawQuery("SELECT * FROM " + tabla_juego + " WHERE nombreJuego ='" + nombreJuego + "' " + " ORDER BY puntaje DESC ", null);

            if (cursorJugador.moveToFirst()) {
                do {
                    jugador = new jugador();
                    jugador.setNombreJugador(cursorJugador.getString(1));
                    jugador.setComplejidad(cursorJugador.getString(2));
                    jugador.setNivel(cursorJugador.getString(3));
                    jugador.setPuntaje(cursorJugador.getFloat(4));
                    listaJugadores.add(jugador);
                } while (cursorJugador.moveToNext());
            }

            cursorJugador.close();
        }catch (Exception ex){
            ex.toString();
        }
        return listaJugadores;
    }

}

