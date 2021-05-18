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
                bundle.putDouble("latitude",-7.931495926899125);
                bundle.putDouble("longitude", 112.60285445586324);
                bundle.putString("title","Marker in SPBU Pertamina Tlogomas");
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
                bundle.putDouble("latitude",-7.937913810591682);
                bundle.putDouble("longitude", 112.62756736867328);
                bundle.putString("title","Marker in SPBU Pertamina 54.651.06 Soekarno Hatta");
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
                bundle.putDouble("latitude",-7.957141877647392);
                bundle.putDouble("longitude", 112.61339960360988);
                bundle.putString("title","Marker in Pertamina Gas Station Bendungan Sutami");
                bundle.putString("data","LowokwaruSPBU1");

                Intent intent = new Intent(LowokwaruSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

//        btnLSPBU4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putDouble("latitude",-7.983287744728502);
//                bundle.putDouble("longitude", 112.614592359649);
//                bundle.putString("title","Marker in SPBU PERTAMINA");
//                bundle.putString("data","LowokwaruSPBU1");
//
//                Intent intent = new Intent(LowokwaruSPBU.this, SPBUMaps.class);
//                intent.putExtras(bundle);
//                startActivity(intent);
//
//            }
//        });
    }
}