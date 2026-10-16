package com.example.museu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;

public class BluetoothActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);

        CircularProgressIndicator progressBar = findViewById(R.id.progressBar);
        TextView tvStatus = findViewById(R.id.tvStatus);
        MaterialCardView cardResult = findViewById(R.id.cardResult);

        findViewById(R.id.btnBackBt).setOnClickListener(v -> finish());
        findViewById(R.id.toolbarBt).setNavigationOnClickListener(v -> finish());

        // Ação para ver a obra encontrada
        findViewById(R.id.btnViewArtwork).setOnClickListener(v -> {
            startActivity(new Intent(BluetoothActivity.this, DetailsActivity.class));
            finish();
        });

        // Simulação elegante de busca
        new Handler().postDelayed(() -> {
            progressBar.setVisibility(View.GONE);
            tvStatus.setText("Dispositivo sincronizado!");
            cardResult.setVisibility(View.VISIBLE);
        }, 3500);
    }
}