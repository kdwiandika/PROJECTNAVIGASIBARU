package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class LowokwaruSPBU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lowokwaru_spbu);

        LinearLayout btnLSPBU1 = findViewById(R.id.btnLSPBU1);
        LinearLayout btnLSPBU2 = findViewById(R.id.btnLSPBU2);
        LinearLayout btnLSPBU3 = findViewById(R.id.btnLSPBU3);
        LinearLayout btnLSPBU4 = findViewById(R.id.btnLSPBU4);



        btnLSPBU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.986216438471941);
                bundle.putDouble("longitude", 112.62668843465708);
                bundle.putString("title","Marker in SPBU PERTAMINA");
                bundle.putString("data","LowokwaruSPBU1");

                Intent intent = new Intent(LowokwaruSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLSPBU2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.980593713284669);
                bundle.putDouble("longitude", 112.63743995016918);
                bundle.putString("title","Marker in SPBU PERTAMINA");
                bundle.putString("data","LowokwaruSPBU1");

                Intent intent = new Intent(LowokwaruSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLSPBU3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.961950501492613);
                bundle.putDouble("longitude", 112.6240482735598);
                bundle.putString("title","Marker in SPBU PERTAMINA2");
                bundle.putString("data","LowokwaruSPBU1");

                Intent intent = new Intent(LowokwaruSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLSPBU4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.983287744728502);
                bundle.putDouble("longitude", 112.614592359649);
                bundle.putString("title","Marker in SPBU PERTAMINA");
                bundle.putString("data","LowokwaruSPBU1");

                Intent intent = new Intent(LowokwaruSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}