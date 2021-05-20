package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sukun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukun);

        TextView btnSSPBU = findViewById(R.id.btnSSPBU);
        btnSSPBU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sukun.this, SukunSPBU.class);
                startActivity(intent);

            }
        });

        TextView btnSKPolisi = findViewById(R.id.btnSKPolisi);
        btnSKPolisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sukun.this, SukunKantorPolisi.class);
                startActivity(intent);

            }
        });

        TextView btnSRSakit = findViewById(R.id.btnSRSakit);
        btnSRSakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sukun.this, SukunRumahSakit.class);
                startActivity(intent);

            }
        });

        TextView btnSPasar = findViewById(R.id.btnSPasar);
        btnSPasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sukun.this, SukunPasar.class);
                startActivity(intent);

            }
        });
    }
}