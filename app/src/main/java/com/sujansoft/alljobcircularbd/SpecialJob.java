package com.sujansoft.alljobcircularbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphCardView;

public class SpecialJob extends AppCompatActivity {

    NeumorphCardView dataEntry,Electrician;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.special_job);

        dataEntry = findViewById(R.id.dataEntry);
        Electrician = findViewById(R.id.Electrician);


        //setOnclik Start=================

        dataEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(SpecialJob.this ,SpDataEntry.class);
                startActivity(myIntent);

            }
        });

        Electrician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(SpecialJob.this ,SpElectrician.class);
                startActivity(myIntent);

            }
        });



        //onClick End======================


    }
}