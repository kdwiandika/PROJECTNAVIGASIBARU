package com.pbo.projectnavigasi;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    private Button btnKSPBU, btnKKPolisi, btnKRSakit, btnKHotel;
//    private Button btnLSPBU, btnLKPolisi, btnLRSakit, btnLHotel;
//    private Button btnSSPBU, btnSKPolisi, btnSRSakit, btnSHotel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        check();
//        btnKSPBU = (Button) findViewById(R.id.btnKSPBU);
//        btnKKPolisi = (Button) findViewById(R.id.btnKKPolisi);
//        btnKRSakit = (Button) findViewById(R.id.btnKRSakit);
//        btnKHotel = (Button) findViewById(R.id.btnKHotel);
//
//        btnLSPBU = (Button) findViewById(R.id.btnLSPBU);
//        btnLKPolisi = (Button) findViewById(R.id.btnLKPolisi);
//        btnLRSakit = (Button) findViewById(R.id.btnLRSakit);
//        btnLHotel = (Button) findViewById(R.id.btnLHotel);
//
//        btnSSPBU = (Button) findViewById(R.id.btnSSPBU);
//        btnSKPolisi = (Button) findViewById(R.id.btnSKPolisi);
//        btnSRSakit = (Button) findViewById(R.id.btnSRSakit);
//        btnSHotel = (Button) findViewById(R.id.btnSHotel);

        Button btnKlojen = findViewById(R.id.btnKlojen);
        btnKlojen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Klojen.class);
                startActivity(intent);

            }
        });

        Button btnLowokwaru = findViewById(R.id.btnLowokwaru);
        btnLowokwaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lowokwaru.class);
                startActivity(intent);

            }
        });

        Button btnSukun = findViewById(R.id.btnSukun);
        btnSukun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sukun.class);
                startActivity(intent);

            }
        });

    }

//    private void check() {
//        String[] permission = {
//                Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION
//
//        };
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M &&
//                checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION)
//                        != PackageManager.PERMISSION_GRANTED &&
//
//                checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION)
//                        != PackageManager.PERMISSION_GRANTED) { requestPermissions(permission, 1234);
//
//        }
//    }
}