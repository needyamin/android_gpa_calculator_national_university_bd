package com.android.needyaminpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class cgpa extends AppCompatActivity {
 private Button buttton;
 private EditText gpa1,gpa2,gpa3,gpa4;
 private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);

        //collect IDS
        buttton = findViewById(R.id.button);
        gpa1 = findViewById(R.id.gpa1);
        gpa2 = findViewById(R.id.gpa2);
        gpa3 = findViewById(R.id.gpa3);
        gpa4 = findViewById(R.id.gpa4);
        result = findViewById(R.id.result);

        //start button event
        buttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //IF Fields are empty
                if((gpa1.getText().toString().isEmpty() && gpa2.getText().toString().isEmpty() &&
                        gpa3.getText().toString().isEmpty() && gpa4.getText().toString().isEmpty()))
                {
                    Toast.makeText(cgpa.this,"Empty Field Bro",Toast.LENGTH_SHORT).show();
                }
                else{
                    //recive strings text
                    String first_gpa = gpa1.getText().toString();
                    String second_gpa = gpa2.getText().toString();
                    String third_gpa = gpa3.getText().toString();
                    String four_gpa = gpa4.getText().toString();

                    //converting int for math
                    int gp1 = Integer.parseInt(first_gpa);
                    int gp2 = Integer.parseInt(second_gpa);
                    int gp3 = Integer.parseInt(third_gpa);
                    int gp4 = Integer.parseInt(four_gpa);

                    int total = gp1 + gp2 + gp3 + gp4;
                    int sum = total;

                    result.setText(Integer.toString(sum));
                }
            }
        });
       //end button event



    }
}