package com.example.parquedediversiones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button accion, deportes, chicas, puzzle, sobreLaApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        accion = (Button) findViewById(R.id.accion);
        deportes = (Button) findViewById(R.id.deportes);
        chicas = (Button) findViewById(R.id.chicas);
        puzzle = (Button) findViewById(R.id.puzzle);
        sobreLaApp = (Button) findViewById(R.id.sobreLaApp);

        accion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, Accion.class);
                startActivity(intent);
            }
        });

        chicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, Chicas.class);
                startActivity(intent);
            }
        });

        puzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, Puzzle.class);
                startActivity(intent);
            }
        });

        deportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, Deportes.class);
                startActivity(intent);
            }
        });

        sobreLaApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, informacion_app.class);
                startActivity(intent);
            }
        });
    }
}