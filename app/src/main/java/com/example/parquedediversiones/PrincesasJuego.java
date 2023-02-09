package com.example.parquedediversiones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.parquedediversiones.db.dbJuegos;

import java.util.ArrayList;

public class PrincesasJuego extends AppCompatActivity {
    Button back, home, finalizar;
    EditText nombreJugador,   puntaje;
    String nivel,complejidad;
    String nombreJuego;

    ArrayList<String> complejidades = new ArrayList<>();
    ArrayList<String> niveles = new ArrayList<>();
    private Spinner miSpinner, miSpinner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_princesas_juego);

        back = (Button) findViewById(R.id.back);
        home = (Button) findViewById(R.id.home);
        finalizar = (Button) findViewById(R.id.finalizar);
        miSpinner = findViewById(R.id.complejidad);
        miSpinner2 = findViewById(R.id.nivel);
        back = (Button) findViewById(R.id.back);
        home = (Button) findViewById(R.id.home);
        finalizar = (Button) findViewById(R.id.finalizar);
        complejidades.add("  Novato");
        complejidades.add("  Amateur");
        complejidades.add("  Profesional");
        niveles.add("  Nivel 1");
        niveles.add("  Nivel 2");
        niveles.add("  Nivel 3");
        niveles.add("  Nivel 4");
        niveles.add("  Nivel 5");
        niveles.add("  Nivel 6");
        niveles.add("  Nivel 7");
        niveles.add("  Nivel 8");
        niveles.add("  Nivel 9");
        niveles.add("  Nivel 10");

        ArrayAdapter adp = new ArrayAdapter(PrincesasJuego.this, android.R.layout.simple_spinner_dropdown_item, complejidades);
        ArrayAdapter adp2 = new ArrayAdapter(PrincesasJuego.this, android.R.layout.simple_spinner_dropdown_item, niveles);
        miSpinner.setAdapter(adp);
        miSpinner2.setAdapter(adp2);
        nombreJuego = "princesas";
        nombreJugador = findViewById(R.id.nameJugador);

        puntaje = findViewById(R.id.puntaje);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(PrincesasJuego.this, MainActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(PrincesasJuego.this, Princesas.class);
                startActivity(intent);
            }
        });

        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                complejidad =  miSpinner.getSelectedItem().toString();
                nivel =miSpinner2.getSelectedItem().toString();
                dbJuegos dbjuego = new dbJuegos(PrincesasJuego.this);
                long id = dbjuego.insertar(nombreJuego, nombreJugador.getText().toString(), complejidad, nivel, Float.parseFloat(puntaje.getText().toString()));

                if(id> 0){
                    Toast.makeText(PrincesasJuego.this, "REGISTRO GUARDADO", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(PrincesasJuego.this, Futbol.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(PrincesasJuego.this, "ERROR AL GUARDAR REGISTRO", Toast.LENGTH_LONG).show();

                }

                Intent intent = new Intent(PrincesasJuego.this, Princesas.class);
                startActivity(intent);
            }
        });
    }
}