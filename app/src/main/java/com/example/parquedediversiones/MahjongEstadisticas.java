package com.example.parquedediversiones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.parquedediversiones.adaptadores.listaEstadisticasAdapter;
import com.example.parquedediversiones.db.dbJuegos;
import com.example.parquedediversiones.entidades.jugador;

import java.util.ArrayList;

public class MahjongEstadisticas extends AppCompatActivity {
    Button back, home;
    RecyclerView listaEstadisticas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahjong_estadisticas);
        listaEstadisticas = findViewById(R.id.listaEstadisticas);
        listaEstadisticas.setLayoutManager( new LinearLayoutManager(this));

        back = (Button) findViewById(R.id.back);
        home = (Button) findViewById(R.id.home);
        dbJuegos dbjuego = new dbJuegos(MahjongEstadisticas.this);

        listaEstadisticasAdapter adapter = new listaEstadisticasAdapter(dbjuego.mostrarJugadores("mahjong"));
        listaEstadisticas.setAdapter(adapter);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MahjongEstadisticas.this, MainActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MahjongEstadisticas.this, Mahjong.class);
                startActivity(intent);
            }
        });
    }
}