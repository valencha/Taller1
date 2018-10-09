package com.example.valentinachavez.taller1;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Receptor.OnMessage{

    TextView tv_user;
    EditText edt_user;
    Button btn_enviar;
    String name;
    Cliente c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_user= findViewById(R.id.tv_user);
        edt_user= findViewById(R.id.edt_user);
        btn_enviar= findViewById(R.id.btn_enviar);
        c = new Cliente(this);
        c.start();



        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = edt_user.getText().toString();
                c.enviar("name"+name);
                    Intent ingreso= new Intent(MainActivity.this,Control.class);
                        startActivity(ingreso);



            }
        });

    }


    @Override
    public void onReceived(String mensaje) {

    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }
}

