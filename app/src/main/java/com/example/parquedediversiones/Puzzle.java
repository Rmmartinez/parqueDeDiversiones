package com.example.parquedediversiones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class Puzzle extends AppCompatActivity {
    Button back, home, truco, solitario, chess, mahjong;
    float x1, x2, y1, y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle);

        back = (Button) findViewById(R.id.back);
        home = (Button) findViewById(R.id.home);
        truco = (Button) findViewById(R.id.truco);
        solitario = (Button) findViewById(R.id.solitario);
        chess = (Button) findViewById(R.id.chess);
        mahjong = (Button) findViewById(R.id.mahjong);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Puzzle.this, MainActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Puzzle.this, MainActivity.class);
                startActivity(intent);
            }
        });

        truco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Puzzle.this, Truco.class);
                startActivity(intent);
            }
        });

        solitario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Puzzle.this, Solitario.class);
                startActivity(intent);
            }
        });

        chess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Puzzle.this, Chess.class);
                startActivity(intent);
            }
        });

        mahjong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Puzzle.this, Mahjong.class);
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
                    Intent intent = new Intent(Puzzle.this, Chicas.class);
                    startActivity(intent);
                } else if (x1 > x2) {
                    Intent intent = new Intent(Puzzle.this, Deportes.class);
                    startActivity(intent);
                }
                break;
        }
        return false;
    }
}