package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class LowokwaruPasar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lowokwaru_pasar);

        LinearLayout btnLPasar1 = findViewById(R.id.btnLPasar1);
        LinearLayout btnLPasar2 = findViewById(R.id.btnLPasar2);
        LinearLayout btnLPasar3 = findViewById(R.id.btnLPasar3);
        LinearLayout btnLPasar4 = findViewById(R.id.btnKPasar4);



        btnLPasar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9886395);
                bundle.putDouble("longitude",112.6277425);
                bundle.putString("title","Marker in Pasar 1");

                Intent intent = new Intent(LowokwaruPasar.this, PasarMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLPasar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9886395);
                bundle.putDouble("longitude",112.6277425);
                bundle.putString("title","Marker in Pasar 2");

                Intent intent = new Intent(LowokwaruPasar.this, PasarMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLPasar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9773719);
                bundle.putDouble("longitude",112.6356159);
                bundle.putString("title","Marker in Pasar 3");

                Intent intent = new Intent(LowokwaruPasar.this, PasarMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLPasar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9741609);
                bundle.putDouble("longitude",112.6365951);
                bundle.putString("title","Marker in Pasar 4");

                Intent intent = new Intent(LowokwaruPasar.this, PasarMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}