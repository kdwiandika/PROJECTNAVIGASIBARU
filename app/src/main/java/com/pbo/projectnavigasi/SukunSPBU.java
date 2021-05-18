package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SukunSPBU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukun_spbu);

        LinearLayout btnSSPBU1 = findViewById(R.id.btnSSPBU1);
        LinearLayout btnSSPBU2 = findViewById(R.id.btnSSPBU2);
        LinearLayout btnSSPBU3 = findViewById(R.id.btnSSPBU3);
        LinearLayout btnSSPBU4 = findViewById(R.id.btnSSPBU4);



        btnSSPBU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.986216438471941);
                bundle.putDouble("longitude", 112.62668843465708);
                bundle.putString("title","Marker in SPBU PERTAMINA");
                bundle.putString("data","KSukunSPBU");

                Intent intent = new Intent(SukunSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnSSPBU2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.980593713284669);
                bundle.putDouble("longitude", 112.63743995016918);
                bundle.putString("title","Marker in SPBU PERTAMINA");
                bundle.putString("data","KSukunSPBU");

                Intent intent = new Intent(SukunSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnSSPBU3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.961950501492613);
                bundle.putDouble("longitude", 112.6240482735598);
                bundle.putString("title","Marker in SPBU PERTAMINA2");
                bundle.putString("data","KSukunSPBU");

                Intent intent = new Intent(SukunSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnSSPBU4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.983287744728502);
                bundle.putDouble("longitude", 112.614592359649);
                bundle.putString("title","Marker in SPBU PERTAMINA");
                bundle.putString("data","KSukunSPBU");

                Intent intent = new Intent(SukunSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}