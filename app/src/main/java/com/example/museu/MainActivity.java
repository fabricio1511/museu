package com.example.museu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnMap).setOnClickListener(v -> 
            startActivity(new Intent(MainActivity.this, MapActivity.class)));

        findViewById(R.id.btnBluetooth).setOnClickListener(v -> 
            startActivity(new Intent(MainActivity.this, BluetoothActivity.class)));

        findViewById(R.id.btnDetail).setOnClickListener(v -> 
            startActivity(new Intent(MainActivity.this, DetailsActivity.class)));
    }
}