package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Klojen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klojen);

        TextView btnKSPBU = findViewById(R.id.btnKSPBU);
        btnKSPBU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Klojen.this, KlojenSPBU.class);
                startActivity(intent);

            }
        });

        TextView btnKKPolisi = findViewById(R.id.btnKKPolisi);
        btnKKPolisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Klojen.this, KlojenKantorPolisi.class);
                startActivity(intent);

            }
        });

        TextView btnKRSakit = findViewById(R.id.btnKRSakit);
        btnKRSakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Klojen.this, KlojenRumahSakit.class);
                startActivity(intent);

            }
        });

        TextView btnKPasar = findViewById(R.id.btnKPasar);
        btnKPasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Klojen.this, KlojenPasar.class);
                startActivity(intent);

            }
        });
    }
}