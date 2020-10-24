package com.example.tcc.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.example.tcc.R;

public class TelaInicio extends AppCompatActivity {

    private Object view;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_activity_telainicio);


        new CountDownTimer(3000,1000){
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Intent i = new Intent(com.example.tcc.inicio.TelaInicio.this, com.example.tcc.inicio.EscolhaInicio.class);
                startActivity(i);
                finish();
            }
        }.start();

    }


}