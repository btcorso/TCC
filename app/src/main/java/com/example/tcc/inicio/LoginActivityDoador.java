package com.example.tcc.inicio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tcc.R;

public class LoginActivityDoador extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_activity_login_doador);

        Button btnEnviarLoginDoador = findViewById(R.id.btnLogin_doador);
        btnEnviarLoginDoador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(com.example.tcc.inicio.LoginActivityDoador.this , com.example.tcc.doador.DoadorMainActivity.class);
                startActivity(i);
                finish();
            }
        });

        Button btnNovoDoador = findViewById(R.id.btnNovoDoador);
        btnNovoDoador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(com.example.tcc.inicio.LoginActivityDoador.this , com.example.tcc.inicio.CadastroDoadorActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}