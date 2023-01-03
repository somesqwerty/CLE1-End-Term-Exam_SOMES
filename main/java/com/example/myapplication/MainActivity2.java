package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2
        );

        ImageView img3 = (ImageView) findViewById(R.id.braceletimg);
        ImageView img4 =(ImageView) findViewById(R.id.earingsimg);
        ImageView img5 = (ImageView) findViewById(R.id.necklaceimg);
        ImageView img6 = (ImageView) findViewById(R.id.ringimg);



        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(MainActivity2.this, Braceletgors.class);
                startActivity(int1);

            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(MainActivity2.this, earinggors.class);
                startActivity(int2);



            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(MainActivity2.this, necklacegors.class);
                startActivity(int3);



            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(MainActivity2.this, ringgors.class);
                startActivity(int4);



            }
        });
    }


}