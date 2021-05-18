package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class KlojenPasar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klojen_pasar);

        LinearLayout btnKPasar1 = findViewById(R.id.btnKPasar1);
        LinearLayout btnKPasar2 = findViewById(R.id.btnKPasar2);
        LinearLayout btnKPasar3 = findViewById(R.id.btnKPasar3);
        LinearLayout btnKPasar4 = findViewById(R.id.btnKPasar4);



        btnKPasar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.972864209780584);
                bundle.putDouble("longitude",112.63685640109684);
                bundle.putString("title","Marker in Klojen Traditional Market");

                Intent intent = new Intent(KlojenPasar.this, PasarMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

//        btnKPasar2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putDouble("latitude",-7.972864209780584);
//                bundle.putDouble("longitude", 112.63685640109684);
//                bundle.putString("title","Marker in Klojen Traditional Market");
//
//                Intent intent = new Intent(KlojenPasar.this, PasarMaps.class);
//                intent.putExtras(bundle);
//                startActivity(intent);
//
//            }
//        });
//
//        btnKPasar3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putDouble("latitude",-7.9773719);
//                bundle.putDouble("longitude",112.6356159);
//                bundle.putString("title","Marker in Pasar 3");
//
//                Intent intent = new Intent(KlojenPasar.this, PasarMaps.class);
//                intent.putExtras(bundle);
//                startActivity(intent);
//
//            }
//        });
//
//        btnKPasar4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putDouble("latitude",-7.9741609);
//                bundle.putDouble("longitude",112.6365951);
//                bundle.putString("title","Marker in Pasar 4");
//
//                Intent intent = new Intent(KlojenPasar.this, PasarMaps.class);
//                intent.putExtras(bundle);
//                startActivity(intent);
//
//            }
//        });
    }
}