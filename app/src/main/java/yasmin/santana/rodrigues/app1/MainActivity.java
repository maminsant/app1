package yasmin.santana.rodrigues.app1;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnviar = findViewById(R.id.btnEnviar); //'linkando' com o btn da tela pelo id
        btnEnviar.setOnClickListener(new View.OnClickListener() { //função para realizar o evento quando clica no botão
            @Override
            public void onClick(View view) { //método - evento a ser realizado no botão
                Intent i = new Intent(MainActivity.this, NextActivity.class); //cria a intent, qu pega informações da activity 1 e passa para 2.
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); //'linkando' com o edit text da tela pelo id
                String textoDigitado = etDigiteAqui.getText().toString(); //pega o texto do et e converte para string
                i.putExtra("texto", textoDigitado); //cria uma chave no dicionário com a chave texto, correspondente ao texto que a pessoa digitou
                startActivity(i); //inicia evento na tela
            }
        });
    }
}