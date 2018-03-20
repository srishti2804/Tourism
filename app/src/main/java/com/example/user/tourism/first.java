package com.example.user.tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Thread th=new Thread()
        {
            public void run(){
                try{
                    sleep(4000);
                }catch(Exception h){}
                finally {
                    Intent i=new Intent(first.this,second.class);
                    startActivity(i);
                    finish();
                }
                }

        };
        th.start();

    }
}
