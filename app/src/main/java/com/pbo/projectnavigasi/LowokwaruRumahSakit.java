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
                bundle.putDouble("latitude",-7.941226948400597);
                bundle.putDouble("longitude", 112.6215371167566);
                bundle.putString("title","Marker in Rumah Sakit Universitas Brawijaya");

                Intent intent = new Intent(LowokwaruRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLRSakit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.940264248395103);
                bundle.putDouble("longitude", 112.60883342896216);
                bundle.putString("title","Marker in RSI UNISMA");

                Intent intent = new Intent(LowokwaruRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLRSakit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.93498598335029);
                bundle.putDouble("longitude", 112.65020826897494);
                bundle.putString("title","Marker in Persada Hospital");

                Intent intent = new Intent(LowokwaruRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLRSakit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.958765843973331);
                bundle.putDouble("longitude", 112.65553217412712);
                bundle.putString("title","Marker in Mother & Child Hospital Puri Bunda");

                Intent intent = new Intent(LowokwaruRumahSakit.this, RumahSakitMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}