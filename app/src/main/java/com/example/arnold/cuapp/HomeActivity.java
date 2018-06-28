package com.example.arnold.cuapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button Tips1,Tips2,Tips3,Tips4,Tips5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       Tips1 = (Button)findViewById(R.id.btn1);
       Tips1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent x = new Intent(HomeActivity.this,Tips_1.class);
               startActivity(x);
           }
       });
        Tips2 = (Button)findViewById(R.id.btn2);
        Tips2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(HomeActivity.this,Tips_2.class);
                startActivity(x);
            }
        });
        Tips3 = (Button)findViewById(R.id.btn3);
        Tips3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(HomeActivity.this,Tips_3.class);
                startActivity(x);
            }
        });
        Tips4 = (Button)findViewById(R.id.btn4);
        Tips4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(HomeActivity.this,Tips_4.class);
                startActivity(x);
            }
        });
        Tips5 = (Button)findViewById(R.id.btn5);
        Tips5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(HomeActivity.this,Tips_5.class);
                startActivity(x);
            }
        });
    }
}
