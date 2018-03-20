package com.example.user.tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second extends AppCompatActivity {
    TextView t,t1;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t=(TextView)findViewById(R.id.textView);
        b=(Button)findViewById(R.id.button);
        t1=(TextView)findViewById(R.id.txt);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i=new Intent(second.this,third.class);
                startActivity(i);
            }
        });
    }
}
