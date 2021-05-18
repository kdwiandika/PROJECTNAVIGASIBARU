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
                bundle.putDouble("latitude",-7.96419851536405);
                bundle.putDouble("longitude", 112.60311254400263);
                bundle.putString("title","Marker in SPBU Pertamina 54-651.60");
                bundle.putString("data","SukunSPBU");

                Intent intent = new Intent(SukunSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnSSPBU2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-7.995375120170025);
                bundle.putDouble("longitude", 112.61976757606905);
                bundle.putString("title","Marker in SPBU Pertamina 54.651.14");
                bundle.putString("data","SukunSPBU");

                Intent intent = new Intent(SukunSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnSSPBU3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-8.003839345919888);
                bundle.putDouble("longitude", 112.63008019037252);
                bundle.putString("title","Marker in SPBU PERTAMINA");
                bundle.putString("data","SukunSPBU");

                Intent intent = new Intent(SukunSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnSSPBU4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude",-8.03107719528011);
                bundle.putDouble("longitude", 112.62709376164231);
                bundle.putString("title","Marker in SPBU Pertamina 54.651.33");
                bundle.putString("data","SukunSPBU");

                Intent intent = new Intent(SukunSPBU.this, SPBUMaps.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}