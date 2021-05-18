package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class LowokwaruKantorPolisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lowokwaru_kantor_polisi);

        LinearLayout btnLKPolisi1 = findViewById(R.id.btnLKPolisi1);
        LinearLayout btnLKPolisi2 = findViewById(R.id.btnLKPolisi2);
        LinearLayout btnLKPolisi3 = findViewById(R.id.btnLKPolisi3);
        LinearLayout btnLKPolisi4 = findViewById(R.id.btnLKPolisi4);



        btnLKPolisi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.941397065758914);
                bundle.putDouble("longitude", 112.60935480273872);
                bundle.putString("title","Marker in Kantor Polsek Lowokwaru");

                Intent intent = new Intent(LowokwaruKantorPolisi.this, KantorPolisiMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

//        btnLKPolisi2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putDouble("latitude",-7.9843829);
//                bundle.putDouble("longitude",112.6271627);
//                bundle.putString("title","Marker in SPBU Kantor Polisi 2");
//
//                Intent intent = new Intent(LowokwaruKantorPolisi.this, KantorPolisiMaps.class);
//                intent.putExtras(bundle);
//                startActivity(intent);
//
//            }
//        });
//
//        btnLKPolisi3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putDouble("latitude",-7.9843829);
//                bundle.putDouble("longitude",112.6271627);
//                bundle.putString("title","Marker in Kantor Polisi 3");
//
//                Intent intent = new Intent(LowokwaruKantorPolisi.this, KantorPolisiMaps.class);
//                intent.putExtras(bundle);
//                startActivity(intent);
//
//            }
//        });
//
//        btnLKPolisi4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putDouble("latitude",-7.9843829);
//                bundle.putDouble("longitude",112.6271627);
//                bundle.putString("title","Marker in Kantor Polisi 4");
//
//                Intent intent = new Intent(LowokwaruKantorPolisi.this, KantorPolisiMaps.class);
//                intent.putExtras(bundle);
//                startActivity(intent);
//
//            }
//        });
    }
}