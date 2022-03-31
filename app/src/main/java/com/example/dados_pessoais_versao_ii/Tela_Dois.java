package com.example.dados_pessoais_versao_ii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Tela_Dois extends AppCompatActivity {

    TextView txt_texto;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dois);


        txt_texto = findViewById(R.id.txt_texto);
        intent = getIntent();

        Pessoa pessoa = (Pessoa) intent.getSerializableExtra("pessoa");
        txt_texto.setText(pessoa.mostrarDados());
    }
}