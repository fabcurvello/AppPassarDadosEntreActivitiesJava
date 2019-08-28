package com.example.passardadosentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView tvIdade;
    private TextView tvResposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        tvIdade = findViewById(R.id.tvIdade);
        tvResposta = findViewById(R.id.tvReposta);

        //Recuperar os dados que foram enviados pela intent
        Bundle dados = getIntent().getExtras();
        int idade = dados.getInt("idadeInserida");

        //Inserindo a idade recuperada na TextView. Necessário converter para String.
        tvIdade.setText( String.valueOf( idade ));

        //Verificando se é menor ou maior de idade para exibir na tvResposta
        if ( idade < 18 ) {
            tvResposta.setText("Você é menor de idade");
        } else {
            tvResposta.setText("Você é maior de idade");
        }

    }
}
