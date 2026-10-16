package com.example.museu;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class ErrorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);

        // Tentar novamente (geralmente fecha o erro e volta para a tela anterior)
        findViewById(R.id.btnRetry).setOnClickListener(v -> finish());

        // Voltar ao início (limpa a pilha e vai para a Main)
        findViewById(R.id.btnBackStart).setOnClickListener(v -> {
            Intent intent = new Intent(ErrorActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });
    }
}