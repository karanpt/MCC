package com.example.karan.androidtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        CardView basics = findViewById(R.id.basic);
        CardView howto = findViewById(R.id.howto);
        CardView test = findViewById(R.id.test);
        basics.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                        Intent intent = new Intent(StartActivity.this,BasicActivity.class);
                                startActivity(intent);
                                      }
                                  }

        );
        howto.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(StartActivity.this,MainActivity.class);
                                          startActivity(intent);
                                      }
                                  }

        );
        test.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(StartActivity.this,TestActivity.class);
                                          startActivity(intent);
                                      }
                                  }

        );
    }
}
