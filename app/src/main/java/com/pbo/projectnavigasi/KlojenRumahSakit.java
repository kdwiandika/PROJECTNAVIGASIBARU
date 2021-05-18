package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class KlojenRumahSakit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klojen_rumah_sakit);

        LinearLayout btnKRSakit1 = findViewById(R.id.btnKRSakit1);
        LinearLayout btnKRSakit2 = findViewById(R.id.btnKRSakit2);
        LinearLayout btnKRSakit3 = findViewById(R.id.btnKRSakit3);
        LinearLayout btnKRSakit4 = findViewById(R.id.btnKRSakit4);



        btnKRSakit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.952293549487344);
                bundle.putDouble("longitude", 112.61839714484347);
                bundle.putString("title","Marker in RSU BRIMEDIKA MALANG");

                Intent intent = new Intent(KlojenRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnKRSakit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.963989160140024);
                bundle.putDouble("longitude", 112.62211161276727);
                bundle.putString("title","Marker in Rumah Sakit Umum Dr Han Sik Liang");

                Intent intent = new Intent(KlojenRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnKRSakit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.965735144988569);
                bundle.putDouble("longitude", 112.63723651950929);
                bundle.putString("title","Marker in Loby Utama Rs Lavalet Malang");

                Intent intent = new Intent(KlojenRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnKRSakit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.975666359291309);
                bundle.putDouble("longitude", 112.62169581334204);
                bundle.putString("title","Marker in Poli Dokter Spesialis Melati Husada");

                Intent intent = new Intent(KlojenRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}