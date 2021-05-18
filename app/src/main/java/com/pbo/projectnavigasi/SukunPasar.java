package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SukunPasar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukun_pasar);

        LinearLayout btnSPasar1 = findViewById(R.id.btnSPasar1);
        LinearLayout btnSPasar2 = findViewById(R.id.btnSPasar2);
        LinearLayout btnSPasar3 = findViewById(R.id.btnSPasar3);
        LinearLayout btnSPasar4 = findViewById(R.id.btnSPasar4);



        btnSPasar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.997107696475266);
                bundle.putDouble("longitude", 112.61934339441329);
                bundle.putString("title","Marker in Pasar Sukun");

                Intent intent = new Intent(SukunPasar.this, PasarMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

//        btnSPasar2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putDouble("latitude",-7.9886395);
//                bundle.putDouble("longitude",112.6277425);
//                bundle.putString("title","Marker in Pasar 2");
//
//                Intent intent = new Intent(SukunPasar.this, PasarMaps.class);
//                intent.putExtras(bundle);
//                startActivity(intent);
//
//            }
//        });
//
//        btnSPasar3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putDouble("latitude",-7.9773719);
//                bundle.putDouble("longitude",112.6356159);
//                bundle.putString("title","Marker in Pasar 3");
//
//                Intent intent = new Intent(SukunPasar.this, PasarMaps.class);
//                intent.putExtras(bundle);
//                startActivity(intent);
//
//            }
//        });
//
//        btnSPasar4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putDouble("latitude",-7.9741609);
//                bundle.putDouble("longitude",112.6365951);
//                bundle.putString("title","Marker in Pasar 4");
//
//                Intent intent = new Intent(SukunPasar.this, PasarMaps.class);
//                intent.putExtras(bundle);
//                startActivity(intent);
//
//            }
//        });
    }
}