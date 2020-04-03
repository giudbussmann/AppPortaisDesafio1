package com.example.appportaisdesafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        //INTENT:
        // O "Intent" chama o "intent1", "conectando" o WebViewActivity ao MainActivity

        //WEBVIEW:
        //No activity_web_view.xml, criamos um WebView, que é acessado pelo "webview"
        //Chamamos esse "webview";
        //Falamos para o Aplicativo que é para abrir o site dentro dele;
        //mostramos o site nessa tela

        Intent intent1 = getIntent();

        WebView webview = findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);


        webview.loadUrl(intent1.getStringExtra("site"));

    }
}
