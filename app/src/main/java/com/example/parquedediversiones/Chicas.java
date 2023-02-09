package com.example.parquedediversiones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class Chicas extends AppCompatActivity {
    Button back, home, pastelera, princesas, ninera, estilista;
    float x1, x2, y1, y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicas);

        back = (Button) findViewById(R.id.back);
        home = (Button) findViewById(R.id.home);
        pastelera = (Button) findViewById(R.id.pastelera);
        princesas = (Button) findViewById(R.id.princesas);
        ninera = (Button) findViewById(R.id.ninera);
        estilista = (Button) findViewById(R.id.estilista);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Chicas.this, MainActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Chicas.this, MainActivity.class);
                startActivity(intent);
            }
        });

        pastelera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Chicas.this, Pastelera.class);
                startActivity(intent);
            }
        });

        princesas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Chicas.this, Princesas.class);
                startActivity(intent);
            }
        });

        ninera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Chicas.this, Ninera.class);
                startActivity(intent);
            }
        });

        estilista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Chicas.this, Estilista.class);
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
                    Intent intent = new Intent(Chicas.this, Accion.class);
                    startActivity(intent);
                } else if (x1 > x2) {
                    Intent intent = new Intent(Chicas.this, Puzzle.class);
                    startActivity(intent);
                }
                break;
        }
        return false;
    }
}