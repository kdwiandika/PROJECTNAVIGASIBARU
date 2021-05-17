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
                bundle.putDouble("latitude",-7.9773826);
                bundle.putDouble("longitude",112.6338636);
                bundle.putString("title","Marker in Rumah Sakit 1");

                Intent intent = new Intent(KlojenRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnKRSakit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9684043);
                bundle.putDouble("longitude",112.6365707);
                bundle.putString("title","Marker in Rumah Sakit 2");

                Intent intent = new Intent(KlojenRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnKRSakit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9684043);
                bundle.putDouble("longitude",112.6365707);
                bundle.putString("title","Marker in Rumah Sakit 3");

                Intent intent = new Intent(KlojenRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnKRSakit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9684043);
                bundle.putDouble("longitude",112.6365707);
                bundle.putString("title","Marker in Rumah Sakit 4");

                Intent intent = new Intent(KlojenRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}