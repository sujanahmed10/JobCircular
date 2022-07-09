package com.sujansoft.alljobcircularbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout govejob,privetjob,jobcatagory,specialjob,jobexamalert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        govejob = findViewById(R.id.govejob);
        privetjob = findViewById(R.id.privetjob);
        jobcatagory = findViewById(R.id.jobcatagory);
        specialjob = findViewById(R.id.specialjob);
        jobexamalert = findViewById(R.id.jobexamalert);



        //set onClik Start=========================================================================
        govejob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent myIntent= new Intent(MainActivity.this,GoveMentJob.class);
                startActivity(myIntent);



            }
        });

        //=========================================================================================

        privetjob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent= new Intent(MainActivity.this,PrivetJob.class);
                startActivity(myIntent);



            }
        });


        // =======================================================================================

        jobcatagory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent= new Intent(MainActivity.this,JobCatagory.class);
                startActivity(myIntent);



            }
        });


        specialjob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent= new Intent(MainActivity.this,SpecialJob.class);
                startActivity(myIntent);

            }
        });


        jobexamalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent= new Intent(MainActivity.this,JobExamAlert.class);
                startActivity(myIntent);

            }
        });


        //OnClik End===============================================================================




    }
}