package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ringgors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ringgors);


        ImageView img1 = (ImageView) findViewById(R.id.goldimgear);
        ImageView img2 =(ImageView) findViewById(R.id.silverimgear);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(ringgors.this,goldring.class);
                startActivity(int1);

            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(ringgors.this,silverring.class);
                startActivity(int2);



            }
        });
    }


}