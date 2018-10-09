package com.example.valentinachavez.taller1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class Control extends AppCompatActivity {

    private ImageButton btn_arriba, btn_abajo, btn_derecha, btn_izquierda;
    MainActivity activity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);


        btn_arriba = findViewById(R.id.btn_arriba);
        btn_abajo = findViewById(R.id.btn_abajo);
        btn_derecha = findViewById(R.id.btn_derecha);
        btn_izquierda = findViewById(R.id.btn_izquierda);


        btn_arriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.getC().enviar("arriba");
            }
        });

        btn_abajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.getC().enviar("abajo");
            }
        });
        btn_derecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.getC().enviar("derecha");
            }
        });
        btn_izquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.getC().enviar("izquierda");
            }
        });
    }
}
