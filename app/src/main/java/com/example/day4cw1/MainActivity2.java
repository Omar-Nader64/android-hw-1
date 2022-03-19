package com.example.day4cw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView myname1=findViewById(R.id.myname);
        TextView myage1=findViewById(R.id.myage);

        Bundle F=getIntent().getExtras();
        int myage=F.getInt("age");
        String myname=F.getString("name");

        myname1.setText(myname);
        myage1.setText(myage);
    }
}