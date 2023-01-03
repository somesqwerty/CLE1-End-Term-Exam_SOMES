package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class goldbrace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goldbrace);


        ImageView img1 = (ImageView) findViewById(R.id.imageView4);
        ImageView img2 =(ImageView) findViewById(R.id.imageView5);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(goldbrace.this,MainActivity4.class);
                startActivity(int1);

            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(goldbrace.this,MainActivity4.class);
                startActivity(int2);



            }
        });
    }


}