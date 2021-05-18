package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout ;

public class KlojenKantorPolisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klojen_kantor_polisi);

        LinearLayout btnKKPolisi1 = findViewById(R.id.btnKKPolisi1);
        LinearLayout btnKKPolisi2 = findViewById(R.id.btnKKPolisi2);
        LinearLayout btnKKPolisi3 = findViewById(R.id.btnKKPolisi3);
        LinearLayout btnKKPolisi4 = findViewById(R.id.btnKKPolisi4);



        btnKKPolisi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.967568305343913);
                bundle.putDouble("longitude", 112.63597632041323);
                bundle.putString("title","Marker in Kantor SATPAS Polresta Malang Kota");

                Intent intent = new Intent(KlojenKantorPolisi.this, KantorPolisiMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnKKPolisi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.972074154594494);
                bundle.putDouble("longitude", 112.63090677843525);
                bundle.putString("title","Marker in POLRES MALANG KOTA");

                Intent intent = new Intent(KlojenKantorPolisi.this, KantorPolisiMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnKKPolisi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.96248353388797);
                bundle.putDouble("longitude", 112.62595134685081);
                bundle.putString("title","Marker in Satlantas Poresta Malang");

                Intent intent = new Intent(KlojenKantorPolisi.this, KantorPolisiMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnKKPolisi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.990066019716697);
                bundle.putDouble("longitude", 112.62530506291597);
                bundle.putString("title","Marker in Detasemen Polisi Militer");

                Intent intent = new Intent(KlojenKantorPolisi.this, KantorPolisiMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}