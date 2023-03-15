package yasmin.santana.rodrigues.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent i = getIntent(); //cria a intent, qu pega informações da activity 1 e passa para 2.
        String textoDigitado = i.getStringExtra("texto"); //texto que a pessoa digitou passa a corresponder aquela chave do dicionário criado na MAIN
        TextView tvTexto = findViewById(R.id.tvText); //tv mostra na tela, 'linkando' com o tv da tela pelo id
        tvTexto.setText(textoDigitado); //colocando esse texto na tela
    }
}