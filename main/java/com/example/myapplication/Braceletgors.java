package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Braceletgors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        ImageView img1 = (ImageView) findViewById(R.id.goldimgear);
        ImageView img2 =(ImageView) findViewById(R.id.silverimgear);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(Braceletgors.this, goldbrace.class);
                startActivity(int1);

            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(Braceletgors.this,silverbrace.class);
                startActivity(int2);



            }
        });
    }


}