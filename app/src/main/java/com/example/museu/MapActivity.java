package com.example.museu;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.MaterialToolbar;

public class MapActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        MaterialToolbar toolbar = findViewById(R.id.toolbarMap);
        toolbar.setNavigationOnClickListener(v -> finish());

        showPermissionDialog();

        findViewById(R.id.btnBack).setOnClickListener(v -> finish());
    }

    private void showPermissionDialog() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.gps_permission_title)
                .setMessage(R.string.gps_permission_desc)
                .setPositiveButton(R.string.allow, (dialog, which) -> {
                    // Simulação: Permissão concedida
                })
                .setNegativeButton(R.string.deny, (dialog, which) -> {
                    // Simulação: Permissão negada, vai para tela de erro
                    startActivity(new Intent(MapActivity.this, ErrorActivity.class));
                    finish();
                })
                .setCancelable(false)
                .show();
    }
}