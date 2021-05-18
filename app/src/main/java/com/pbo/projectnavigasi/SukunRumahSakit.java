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
                bundle.putDouble("latitude",-7.989864721742596);
                bundle.putDouble("longitude", 112.62047962749124);
                bundle.putString("title","Marker in Army Hospital Doctor Soepraoen");

                Intent intent = new Intent(SukunRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnSRSakit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.988656491133623);
                bundle.putDouble("longitude", 112.62185523013113);
                bundle.putString("title","Marker in Rumah Bersalin (RB) Soerodjo");

                Intent intent = new Intent(SukunRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnSRSakit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.983909947160443);
                bundle.putDouble("longitude", 112.62139365940116);
                bundle.putString("title","Marker in Rumah Sakit Prima Husada");

                Intent intent = new Intent(SukunRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnSRSakit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.998751990898882);
                bundle.putDouble("longitude", 112.62727686627075);
                bundle.putString("title","Marker in Poliklinik Bentoel Janti");

                Intent intent = new Intent(SukunRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}