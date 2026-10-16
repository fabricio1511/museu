package com.example.museu;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.MaterialToolbar;

public class DetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        MaterialToolbar toolbar = findViewById(R.id.toolbarDetail);
        toolbar.setNavigationOnClickListener(v -> finish());

        findViewById(R.id.btnBackDetail).setOnClickListener(v -> finish());

        // Simulação visual do Acelerômetro
        // Faz a obra balançar levemente para simular o efeito 360/giroscópio
        ImageView ivArtwork = findViewById(R.id.ivArtwork);
        if (ivArtwork != null) {
            ObjectAnimator animator = ObjectAnimator.ofFloat(ivArtwork, "rotationY", -8f, 8f);
            animator.setDuration(3000);
            animator.setRepeatMode(ValueAnimator.REVERSE);
            animator.setRepeatCount(ValueAnimator.INFINITE);
            animator.start();
        }
    }
}