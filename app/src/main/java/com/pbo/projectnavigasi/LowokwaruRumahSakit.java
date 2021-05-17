package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class LowokwaruRumahSakit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lowokwaru_rumah_sakit);

        LinearLayout btnLRSakit1 = findViewById(R.id.btnLRSakit1);
        LinearLayout btnLRSakit2 = findViewById(R.id.btnLRSakit2);
        LinearLayout btnLRSakit3 = findViewById(R.id.btnLRSakit3);
        LinearLayout btnLRSakit4 = findViewById(R.id.btnLRSakit4);



        btnLRSakit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9773826);
                bundle.putDouble("longitude",112.6338636);
                bundle.putString("title","Marker in Rumah Sakit 1");

                Intent intent = new Intent(LowokwaruRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLRSakit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9684043);
                bundle.putDouble("longitude",112.6365707);
                bundle.putString("title","Marker in Rumah Sakit 2");

                Intent intent = new Intent(LowokwaruRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLRSakit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9684043);
                bundle.putDouble("longitude",112.6365707);
                bundle.putString("title","Marker in Rumah Sakit 3");

                Intent intent = new Intent(LowokwaruRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLRSakit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9684043);
                bundle.putDouble("longitude",112.6365707);
                bundle.putString("title","Marker in Rumah Sakit 4");

                Intent intent = new Intent(LowokwaruRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}