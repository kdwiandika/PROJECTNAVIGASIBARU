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
        LinearLayout btnLPasar4 = findViewById(R.id.btnLPasar4);



        btnLPasar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.942271412499126);
                bundle.putDouble("longitude", 112.6168246538705);
                bundle.putString("title","Marker in Pasar Omah Malang");

                Intent intent = new Intent(LowokwaruPasar.this, PasarMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLPasar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.961036273888951);
                bundle.putDouble("longitude", 112.61347532897948);
                bundle.putString("title","Marker in Kios pasar sayur sutami");

                Intent intent = new Intent(LowokwaruPasar.this, PasarMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLPasar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.938692498160148);
                bundle.putDouble("longitude", 112.58728972380095);
                bundle.putString("title","Pasar Pintar Joyo Agung");

                Intent intent = new Intent(LowokwaruPasar.this, PasarMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLPasar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.940107810573565);
                bundle.putDouble("longitude", 112.63934590565756);
                bundle.putString("title","Marker in Pasar Blimbing");

                Intent intent = new Intent(LowokwaruPasar.this, PasarMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}