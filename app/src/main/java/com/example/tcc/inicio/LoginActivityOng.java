package com.example.tcc.inicio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tcc.R;

public class LoginActivityOng extends AppCompatActivity {

    Button btnEnviarLoginOng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_activity_login_ong);

        btnEnviarLoginOng = findViewById(R.id.btnLogin_doador);
        btnEnviarLoginOng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(com.example.tcc.inicio.LoginActivityOng.this, com.example.tcc.ong.OngMainActivity.class);
                startActivity(i);
                finish();
            }
        });

        Button btnNovoOng = findViewById(R.id.btnNovoOng);
        btnNovoOng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(com.example.tcc.inicio.LoginActivityOng.this , com.example.tcc.inicio.CadastroOngActivity.class);
                startActivity(i);
                finish();
            }
        });

    }



}