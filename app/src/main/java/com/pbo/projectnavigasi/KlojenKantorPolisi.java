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
                bundle.putDouble("latitude",-7.9822009);
                bundle.putDouble("longitude",112.6305244);
                bundle.putString("title","Marker in Kantor Polisi 1");

                Intent intent = new Intent(KlojenKantorPolisi.this, KantorPolisiMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnKKPolisi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9843829);
                bundle.putDouble("longitude",112.6271627);
                bundle.putString("title","Marker in SPBU Kantor Polisi 2");

                Intent intent = new Intent(KlojenKantorPolisi.this, KantorPolisiMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnKKPolisi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9843829);
                bundle.putDouble("longitude",112.6271627);
                bundle.putString("title","Marker in Kantor Polisi 3");

                Intent intent = new Intent(KlojenKantorPolisi.this, KantorPolisiMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnKKPolisi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.9843829);
                bundle.putDouble("longitude",112.6271627);
                bundle.putString("title","Marker in Kantor Polisi 4");

                Intent intent = new Intent(KlojenKantorPolisi.this, KantorPolisiMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}