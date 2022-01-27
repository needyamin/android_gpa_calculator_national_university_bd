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


    }
}