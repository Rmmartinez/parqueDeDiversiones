package com.example.parquedediversiones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class Deportes extends AppCompatActivity {
    Button home, back, futbol, golf, tenis, basquet;
    float x1, x2, y1, y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportes);

        back = (Button) findViewById(R.id.back);
        home = (Button) findViewById(R.id.home);
        futbol = (Button) findViewById(R.id.futbol);
        golf = (Button) findViewById(R.id.golf);
        tenis = (Button) findViewById(R.id.tenis);
        basquet = (Button) findViewById(R.id.basquet);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Deportes.this, MainActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Deportes.this, MainActivity.class);
                startActivity(intent);
            }
        });

        futbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Deportes.this, Futbol.class);
                startActivity(intent);
            }
        });

        golf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Deportes.this, Golf.class);
                startActivity(intent);
            }
        });

        basquet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Deportes.this, Basquet.class);
                startActivity(intent);
            }
        });

        tenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Deportes.this, Tenis.class);
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
                    Intent intent = new Intent(Deportes.this, Puzzle.class);
                    startActivity(intent);
                } else if (x1 > x2) {
                    Intent intent = new Intent(Deportes.this, Accion.class);
                    startActivity(intent);
                }
                break;
        }
        return false;
    }
}