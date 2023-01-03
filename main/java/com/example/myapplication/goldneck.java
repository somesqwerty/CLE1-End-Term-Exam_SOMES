package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class goldneck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goldneck);


        ImageView img1 = (ImageView) findViewById(R.id.imageView15);
        ImageView img2 =(ImageView) findViewById(R.id.imageView16);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(goldneck.this,MainActivity4.class);
                startActivity(int1);

            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(goldneck.this,MainActivity4.class);
                startActivity(int2);



            }
        });
    }


}