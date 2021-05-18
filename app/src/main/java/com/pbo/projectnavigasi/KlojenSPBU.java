package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class KlojenSPBU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klojen_spbu);

        LinearLayout btnKSPBU1 = findViewById(R.id.btnKSPBU1);
        LinearLayout btnKSPBU2 = findViewById(R.id.btnKSPBU2);
        LinearLayout btnKSPBU3 = findViewById(R.id.btnKSPBU3);
        LinearLayout btnKSPBU4 = findViewById(R.id.btnKSPBU4);



        btnKSPBU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.986216438471941);
                bundle.putDouble("longitude", 112.62668843465708);
                bundle.putString("title","Marker in SPBU PERTAMINA");
                bundle.putString("data","KlojenSPBU1");

                Intent intent = new Intent(KlojenSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnKSPBU2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.980593713284669);
                bundle.putDouble("longitude", 112.63743995016918);
                bundle.putString("title","Marker in SPBU PERTAMINA");
                bundle.putString("data","KlojenSPBU1");

                Intent intent = new Intent(KlojenSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnKSPBU3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.961950501492613);
                bundle.putDouble("longitude", 112.6240482735598);
                bundle.putString("title","Marker in SPBU PERTAMINA2");
                bundle.putString("data","KlojenSPBU1");

                Intent intent = new Intent(KlojenSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnKSPBU4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.983287744728502);
                bundle.putDouble("longitude", 112.614592359649);
                bundle.putString("title","Marker in SPBU PERTAMINA");
                bundle.putString("data","KlojenSPBU1");

                Intent intent = new Intent(KlojenSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}