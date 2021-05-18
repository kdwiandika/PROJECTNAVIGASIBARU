package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Lowokwaru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lowokwaru);

        TextView btnLSPBU = findViewById(R.id.btnLSPBU);
        btnLSPBU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lowokwaru.this, LowokwaruSPBU.class);
                startActivity(intent);

            }
        });

        TextView btnLKPolisi = findViewById(R.id.btnLKPolisi);
        btnLKPolisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lowokwaru.this, LowokwaruKantorPolisi.class);
                startActivity(intent);

            }
        });

        TextView btnLRSakit = findViewById(R.id.btnLRSakit);
        btnLRSakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lowokwaru.this, LowokwaruRumahSakit.class);
                startActivity(intent);

            }
        });

        TextView btnLPasar = findViewById(R.id.btnLPasar);
        btnLPasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lowokwaru.this, LowokwaruPasar.class);
                startActivity(intent);

            }
        });
    }
}