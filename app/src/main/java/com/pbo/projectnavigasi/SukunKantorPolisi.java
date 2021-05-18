package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SukunKantorPolisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukun_kantor_polisi);

        LinearLayout btnSKPolisi1 = findViewById(R.id.btnSKPolisi1);
        LinearLayout btnSKPolisi2 = findViewById(R.id.btnSKPolisi2);
        LinearLayout btnSKPolisi3 = findViewById(R.id.btnSKPolisi3);
        LinearLayout btnSKPolisi4 = findViewById(R.id.btnSKPolisi4);



        btnSKPolisi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-8.004275470336236);
                bundle.putDouble("longitude", 112.61851432739115);
                bundle.putString("title","Marker in Polsek Sukun");

                Intent intent = new Intent(SukunKantorPolisi.this, KantorPolisiMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

//        btnSKPolisi2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putDouble("latitude",-7.9843829);
//                bundle.putDouble("longitude",112.6271627);
//                bundle.putString("title","Marker in SPBU Kantor Polisi 2");
//
//                Intent intent = new Intent(SukunKantorPolisi.this, KantorPolisiMaps.class);
//                intent.putExtras(bundle);
//                startActivity(intent);
//
//            }
//        });
//
//        btnSKPolisi3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putDouble("latitude",-7.9843829);
//                bundle.putDouble("longitude",112.6271627);
//                bundle.putString("title","Marker in Kantor Polisi 3");
//
//                Intent intent = new Intent(SukunKantorPolisi.this, KantorPolisiMaps.class);
//                intent.putExtras(bundle);
//                startActivity(intent);
//
//            }
//        });
//
//        btnSKPolisi4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putDouble("latitude",-7.9843829);
//                bundle.putDouble("longitude",112.6271627);
//                bundle.putString("title","Marker in Kantor Polisi 4");
//
//                Intent intent = new Intent(SukunKantorPolisi.this, KantorPolisiMaps.class);
//                intent.putExtras(bundle);
//                startActivity(intent);
//
//            }
//        });
    }
}