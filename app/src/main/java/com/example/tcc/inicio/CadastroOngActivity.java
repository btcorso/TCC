package com.example.tcc.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tcc.R;

public class CadastroOngActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_activity_cadastro_ong);

        Button btnEnviarCadastroOng = findViewById(R.id.btnEnviarCadastroOng);
        btnEnviarCadastroOng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(com.example.tcc.inicio.CadastroOngActivity.this , com.example.tcc.ong.OngMainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}