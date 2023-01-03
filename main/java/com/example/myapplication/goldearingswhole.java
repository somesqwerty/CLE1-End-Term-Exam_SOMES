package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class goldearingswhole extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goldearings);


        ImageView img1 = (ImageView) findViewById(R.id.imageView10);
        ImageView img2 =(ImageView) findViewById(R.id.imageView13);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(goldearingswhole.this,wholesalegold.class);
                startActivity(int1);

            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(goldearingswhole.this,wholesalegold.class);
                startActivity(int2);



            }
        });
    }


}