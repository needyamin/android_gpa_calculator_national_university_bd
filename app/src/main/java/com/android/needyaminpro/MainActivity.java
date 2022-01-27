package com.android.needyaminpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button cgpa,gpa,needyamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button action cgpa start
        cgpa = findViewById(R.id.cgpa);
        cgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,cgpa.class);
                startActivity(intent);
            }
        });
        //button action cgpa end


        //button action gpa start
        gpa = findViewById(R.id.gpa);
        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,gpa.class);
                startActivity(intent);
            }
        });
        //button action gpa end


        //button action 1st Year start
        gpa = findViewById(R.id.gpa1);
        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,firstyear.class);
                startActivity(intent);
            }
        });
        //button action 1st Year end


        //button action 2nd Year start
        gpa = findViewById(R.id.gpa2);
        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,secondyear.class);
                startActivity(intent);
            }
        });
        //button action 2nd Year end

        //button action 3rd Year start
        gpa = findViewById(R.id.gpa3);
        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,thirdyear.class);
                startActivity(intent);
            }
        });
        //button action 3rd Year end



        //button action universal_gpa  start
        needyamin = findViewById(R.id.universal);
        needyamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,universal_gpa.class);
                startActivity(intent);
            }
        });
        //button action universal_gpa end


        //button action Land-Measurement  start
        needyamin = findViewById(R.id.land);
        needyamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LandMeasurement.class);
                startActivity(intent);
            }
        });
        //button action Land-Measurement end


        //button action needyamin start
        needyamin = findViewById(R.id.needyamin);
        needyamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,needyamin.class);
                startActivity(intent);
            }
        });
        //button action needyamin end


        //button action sir  start
        needyamin = findViewById(R.id.sir);
        needyamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,sir.class);
                startActivity(intent);
            }
        });
        //button action sir end



    }
}