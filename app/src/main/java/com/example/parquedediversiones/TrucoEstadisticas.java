package com.example.parquedediversiones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.parquedediversiones.adaptadores.listaEstadisticasAdapter;
import com.example.parquedediversiones.db.dbJuegos;

public class TrucoEstadisticas extends AppCompatActivity {

    Button back, home;
    RecyclerView listaEstadisticas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truco_estadisticas);
        listaEstadisticas = findViewById(R.id.listaEstadisticas);
        listaEstadisticas.setLayoutManager( new LinearLayoutManager(this));

        back = (Button) findViewById(R.id.back);
        home = (Button) findViewById(R.id.home);
        dbJuegos dbjuego = new dbJuegos(TrucoEstadisticas.this);

        listaEstadisticasAdapter adapter = new listaEstadisticasAdapter(dbjuego.mostrarJugadores("truco"));
        listaEstadisticas.setAdapter(adapter);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(TrucoEstadisticas.this, MainActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(TrucoEstadisticas.this, Truco.class);
                startActivity(intent);
            }
        });
    }
}