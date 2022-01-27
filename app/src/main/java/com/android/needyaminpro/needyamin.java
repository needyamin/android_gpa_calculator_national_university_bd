package com.android.needyaminpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.WindowManager;
import android.widget.TextView;

public class needyamin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_needyamin);


        //Link Movement YAMIN HOSSAIN SHOHAN
        TextView namedeveloper = findViewById(R.id.namedeveloper);
        namedeveloper.setMovementMethod(LinkMovementMethod.getInstance());

        //Link Movement SOURCE CODE
        TextView sourcecodex = findViewById(R.id.sourcecodex);
        sourcecodex.setMovementMethod(LinkMovementMethod.getInstance());

        //full screen on startup splash screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }
}