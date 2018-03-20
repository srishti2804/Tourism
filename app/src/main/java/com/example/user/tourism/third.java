package com.example.user.tourism;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class third extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        t1=(TextView)findViewById(R.id.txt);
        t2=(TextView)findViewById(R.id.txt1);
        t3=(TextView)findViewById(R.id.txt2);
        t4=(TextView)findViewById(R.id.txt3);
        t5=(TextView)findViewById(R.id.txt4);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(third.this,facts.class);
                startActivity(i);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(third.this,four.class);
                startActivity(i);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(third.this,city.class);
                startActivity(i);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(third.this,dances.class);
                startActivity(i);
            }
        });
    }
}