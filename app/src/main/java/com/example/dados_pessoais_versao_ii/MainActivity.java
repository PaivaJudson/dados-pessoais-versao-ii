package com.example.dados_pessoais_versao_ii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt_nome;
    EditText edt_morada;
    EditText edt_telemovel;
    EditText edt_email;
    EditText edt_sexo;
    Button btn_registar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_nome = findViewById(R.id.edt_nome);
        edt_morada = findViewById(R.id.edt_morada);
        edt_telemovel = findViewById(R.id.edt_telemovel);
        edt_email = findViewById(R.id.edt_email);
        edt_sexo = findViewById(R.id.edt_sexo);
        btn_registar = findViewById(R.id.btn_registar);

        btn_registar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Tela_Dois.class);
                Pessoa pessoa = new Pessoa(
                        edt_nome.getText().toString(),
                        edt_morada.getText().toString(),
                        edt_telemovel.getText().toString(),
                        edt_email.getText().toString(),
                        edt_sexo.getText().toString() );

                intent.putExtra("pessoa", pessoa);
                startActivity(intent);
            }
        });

    }
}