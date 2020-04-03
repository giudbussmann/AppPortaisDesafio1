package com.example.appportaisdesafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //INTENT:
    // o "intent" "conecta" a TelaNomeActivity com o MainActivity
    //o "intent1" "conecta" o WebViewActivity com o MainActivity

    //WEBVIEW:
    //usar a ideia do AppInent, onde escrevemos um texto numa tela e esse texto aparece na outra tela...
    //nesse caso, clicamos numa Imagem, ela abre um site específico, que aparece na outra tela
    //para isso, vamos usar um switch case: para cada Imagem escolhida, abre o site condizente
    // ou seja, chamamos a Imagem e falamos para o aplicativo abrir o site que queremos quando essa Imagem for clicada
    //depois, mandamos o Aplicativo abrir o site na tela WebViewActivity

    public void onSobre(View view) {

        Intent intent = new Intent(this, TelaNomeActivity.class);
        startActivity(intent);
    }

    public void onClick(View view) {

        Intent intent1 = new Intent(this, WebViewActivity.class);

        String site;

        switch (view.getId()){
            case R.id.ImEbay:
                site = "https://www.ebay.com";
                break;
            case R.id.ImBuscape:
                site = "https://www.buscape.com.br";
                break;
            case R.id.ImSubmarino:
                site = "https://www.submarino.com.br";
                break;
            case R.id.ImMercadoLivre:
                site = "https://www.mercadolivre.com.br";
                break;
            default:
                site = null;
                break;
        }

        intent1.putExtra("site", site);
        startActivity(intent1);

    }

}
