package com.example.parquedediversiones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class Accion extends AppCompatActivity {
    Button back, home, bombit, metalslug, mafia, rayman;
    float x1, x2, y1, y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accion);

        back = (Button) findViewById(R.id.back);
        home = (Button) findViewById(R.id.home);
        metalslug = (Button) findViewById(R.id.metalslug);
        bombit = (Button) findViewById(R.id.bombit);
        mafia = (Button) findViewById(R.id.mafia);
        rayman = (Button) findViewById(R.id.rayman);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Accion.this, MainActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Accion.this, MainActivity.class);
                startActivity(intent);
            }
        });

        metalslug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Accion.this, MetalSlug.class);
                startActivity(intent);
            }
        });

        mafia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Accion.this, Mafia.class);
                startActivity(intent);
            }
        });

        bombit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Accion.this, BombIt.class);
                startActivity(intent);
            }
        });

        rayman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Accion.this, Rayman.class);
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
                    Intent intent = new Intent(Accion.this, Deportes.class);
                    startActivity(intent);
                } else if (x1 > x2) {
                    Intent intent = new Intent(Accion.this, Chicas.class);
                    startActivity(intent);
                }
                break;
        }
        return false;
    }
}