package com.sujansoft.alljobcircularbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class JobCatagory extends AppCompatActivity {


    LinearLayout alljob,govedateoverjob,govehotjob,privetdateoverjob,privethotjob,cholomangovejob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.job_catagory);

        alljob = findViewById(R.id.alljob);
        govedateoverjob = findViewById(R.id.govedateoverjob);
        govehotjob = findViewById(R.id.govehotjob);
        privetdateoverjob = findViewById(R.id.privetdateoverjob);
        privethotjob = findViewById(R.id.privethotjob);
        cholomangovejob = findViewById(R.id.cholomangovejob);


        alljob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(JobCatagory.this ,AllJob.class);
                startActivity(myIntent);


            }
        });

        cholomangovejob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(JobCatagory.this ,CholomanGoveJob.class);
                startActivity(myIntent);


            }
        });

        govedateoverjob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(JobCatagory.this ,GoveDateOver.class);
                startActivity(myIntent);

            }
        });


        govehotjob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(JobCatagory.this ,GoveHotJob.class);
                startActivity(myIntent);

            }
        });


        privetdateoverjob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent myIntent = new Intent(JobCatagory.this ,PrivetDateOver.class);
                startActivity(myIntent);

            }
        });


        privethotjob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(JobCatagory.this ,PrivetHotJob.class);
                startActivity(myIntent);



            }
        });






    }
}