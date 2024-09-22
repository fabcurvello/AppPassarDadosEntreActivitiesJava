package com.example.passardadosentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView tvIdade;
    private TextView tvResposta;
    private Button btRetornar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        tvIdade = findViewById(R.id.tvIdade);
        tvResposta = findViewById(R.id.tvReposta);
        btRetornar = findViewById(R.id.bt_retornar);

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

        btRetornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Encerra esta Activity
            }
        });

    }
}
