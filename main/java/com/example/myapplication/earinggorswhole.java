package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class earinggorswhole extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earinggors);


        ImageView img1 = (ImageView) findViewById(R.id.goldimgear);
        ImageView img2 =(ImageView) findViewById(R.id.silverimgear);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(earinggorswhole.this,goldearingswhole.class);
                startActivity(int1);

            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(earinggorswhole.this,goldearingswhole.class);
                startActivity(int2);



            }
        });
    }


}