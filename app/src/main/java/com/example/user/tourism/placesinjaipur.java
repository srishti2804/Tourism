package com.example.user.tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class placesinjaipur extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    ImageView img1,img2,img3,img4,img5,img6,img7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placesinjaipur);
        t1=(TextView)findViewById(R.id.txt);
        t2=(TextView)findViewById(R.id.txt1);
        t3=(TextView)findViewById(R.id.txt2);
        t4=(TextView)findViewById(R.id.txt3);
        t5=(TextView)findViewById(R.id.txt4);
        t6=(TextView)findViewById(R.id.txt5);
        t7=(TextView)findViewById(R.id.txt6);
        t8=(TextView)findViewById(R.id.txt7);
        img1=(ImageView)findViewById( R.id.img1);
        img2=(ImageView)findViewById( R.id.img2);
        img3=(ImageView)findViewById( R.id.img3);
        img4=(ImageView)findViewById( R.id.img4);
        img5=(ImageView)findViewById( R.id.img5);
        img6=(ImageView)findViewById( R.id.img6);
        img7=(ImageView)findViewById( R.id.img7);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(placesinjaipur.this,alberthall.class);
                startActivity(i);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(placesinjaipur.this,amber.class);
                startActivity(i);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(placesinjaipur.this,birla.class);
                startActivity(i);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(placesinjaipur.this,galtaji.class);
                startActivity(i);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(placesinjaipur.this,govind.class);
                startActivity(i);
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(placesinjaipur.this,hawa.class);
                startActivity(i);
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(placesinjaipur.this,jal.class);
                startActivity(i);
            }
        });

    }
}
