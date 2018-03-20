package com.example.user.tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class city extends AppCompatActivity {
    TextView t1,t2,t3;
    ImageView img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        t1=(TextView)findViewById(R.id.txt);
        t2=(TextView)findViewById(R.id.txt1);
        t3=(TextView)findViewById(R.id.txt2);
        img1=(ImageView)findViewById(R.id.img);
        img2=(ImageView)findViewById(R.id.img1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(city.this,placesinjaipur.class);
                startActivity(i);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(city.this,placesinalwar.class);
                startActivity(i);
            }
        });
    }
}
