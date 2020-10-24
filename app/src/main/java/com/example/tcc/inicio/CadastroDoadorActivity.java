package com.example.tcc.inicio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tcc.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class CadastroDoadorActivity extends AppCompatActivity {

    EditText mNome, mCPF, mEndereço, mCEP, mEmail, mTelefone, mSenha;
    Button btnEnviarCadastroDoador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_activity_cadastro_doador);

        mNome = findViewById(R.id.edtNomeCadastroDoador);
        mCPF = findViewById(R.id.edtCPFCadastroDoador);
        mEndereço = findViewById(R.id.edtEnderecoCadastroDoador);
        mCEP = findViewById(R.id.edtCEPCadastroDoador);
        mEmail = findViewById(R.id.edtEmailCadastroDoador);
        mTelefone = findViewById(R.id.edtTelefoneCadastroDoador);
        mSenha = findViewById(R.id.edtPasswordCadastroDoador);
        btnEnviarCadastroDoador = findViewById(R.id.btnEnviarCadastroDoador);

        btnEnviarCadastroDoador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createUser();
            }
        });
    }

    private void createUser() {
        String nome = mNome.getText().toString();
        String email = mEmail.getText().toString();
        String senha = mSenha.getText().toString();
        String CPF = mCPF.getText().toString();
        String telefone = mTelefone.getText().toString();
        String CEP = mCEP.getText().toString();
        String endereco = mEndereço.getText().toString();

//        if (nome == null || nome.isEmpty() || email == null || email.isEmpty() || senha == null || senha.isEmpty() || CPF == null || CPF.isEmpty()
//                || telefone == null || telefone.isEmpty() || CEP == null || CEP.isEmpty() || endereco == null || endereco.isEmpty()) {
//
//            Toast.makeText(this, "Preencha tudo parça", Toast.LENGTH_SHORT).show();
//            return;
//        }

        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, senha)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                            Log.i("Teste", task.getResult().getUser().getUid());

                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.i("Teste", e.getMessage());
                    }
                });

    }



}