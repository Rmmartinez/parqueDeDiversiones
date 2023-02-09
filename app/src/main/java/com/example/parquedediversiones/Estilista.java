package com.example.parquedediversiones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class Estilista extends AppCompatActivity {
    Button back, home, jugar, estadisticas;
    float x1, x2, y1, y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estilista);

        home = (Button) findViewById(R.id.home);
        back = (Button) findViewById(R.id.back);
        jugar = (Button) findViewById(R.id.jugar);
        estadisticas = (Button) findViewById(R.id.estadisticas);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Estilista.this, MainActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Estilista.this, Chicas.class);
                startActivity(intent);
            }
        });


        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "¡Partida finalizada!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Estilista.this, EstilistaJuego.class);
                startActivity(intent);
            }
        });

        estadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "¡Partida finalizada!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Estilista.this, EstilistaEstadisticas.class);
                startActivity(intent);
            }
        });
    }
    public boolean onTouchEvent(MotionEvent touchEvent) {
        switch(touchEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if (x1 < x2) {
                    Intent intent = new Intent(Estilista.this, Ninera.class);
                    startActivity(intent);
                } else if (x1 > x2) {
                    Intent intent = new Intent(Estilista.this, Princesas.class);
                    startActivity(intent);
                }
                break;
        }
        return false;
    }
}