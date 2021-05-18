package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SukunRumahSakit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukun_rumah_sakit);

        LinearLayout btnSRSakit1 = findViewById(R.id.btnSRSakit1);
        LinearLayout btnSRSakit2 = findViewById(R.id.btnSRSakit2);
        LinearLayout btnSRSakit3 = findViewById(R.id.btnSRSakit3);
        LinearLayout btnSRSakit4 = findViewById(R.id.btnSRSakit4);



        btnSRSakit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9773826);
                bundle.putDouble("longitude",112.6338636);
                bundle.putString("title","Marker in Rumah Sakit 1");

                Intent intent = new Intent(SukunRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnSRSakit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9684043);
                bundle.putDouble("longitude",112.6365707);
                bundle.putString("title","Marker in Rumah Sakit 2");

                Intent intent = new Intent(SukunRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnSRSakit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9684043);
                bundle.putDouble("longitude",112.6365707);
                bundle.putString("title","Marker in Rumah Sakit 3");

                Intent intent = new Intent(SukunRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnSRSakit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9684043);
                bundle.putDouble("longitude",112.6365707);
                bundle.putString("title","Marker in Rumah Sakit 4");

                Intent intent = new Intent(SukunRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}