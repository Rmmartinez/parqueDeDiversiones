package com.example.parquedediversiones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.parquedediversiones.db.dbJuegos;

public class GolfJuego extends AppCompatActivity {
    Button back, home, finalizar;
    EditText nombreJugador, complejidad, nivel, puntaje;
    String nombreJuego;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golf_juego);

        back = (Button) findViewById(R.id.back);
        home = (Button) findViewById(R.id.home);
        finalizar = (Button) findViewById(R.id.finalizar);
        nombreJuego = "golf";
        nombreJugador = findViewById(R.id.nameJugador);
        complejidad = (findViewById(R.id.nameJugador));
        nivel = findViewById(R.id.nameJugador);
        puntaje = findViewById(R.id.puntaje);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(GolfJuego.this, MainActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(GolfJuego.this, Golf.class);
                startActivity(intent);
            }
        });

        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbJuegos dbjuego = new dbJuegos(GolfJuego.this);
                long id = dbjuego.insertar(nombreJuego, nombreJugador.getText().toString(), complejidad.getText().toString(), nivel.getText().toString(), Float.parseFloat(puntaje.getText().toString()));

                if(id> 0){
                    Toast.makeText(GolfJuego.this, "REGISTRO GUARDADO", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(GolfJuego.this, Futbol.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(GolfJuego.this, "ERROR AL GUARDAR REGISTRO", Toast.LENGTH_LONG).show();

                }

                Intent intent = new Intent(GolfJuego.this, Golf.class);
                startActivity(intent);
            }
        });
    }
}