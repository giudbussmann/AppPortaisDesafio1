package com.example.appportaisdesafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class TelaNomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_nome);

        //INTENT:
        // O "Intent" chama o "intent", "conectando" a TelaNomeActivity ao MainActivity

        Intent intent = getIntent();

    }
}
