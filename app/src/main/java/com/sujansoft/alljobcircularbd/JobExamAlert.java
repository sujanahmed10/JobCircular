package com.sujansoft.alljobcircularbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class JobExamAlert extends AppCompatActivity {

    LinearLayout alljobexamdate,jobexamalertb2,saveducument,openjoblist,savecv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.job_exam_alert);

        alljobexamdate = findViewById(R.id.alljobexamdate);
        jobexamalertb2 = findViewById(R.id.jobexamalertb2);
        saveducument = findViewById(R.id.saveducument);
        openjoblist = findViewById(R.id.openjoblist);
        savecv = findViewById(R.id.savecv);


        openjoblist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(JobExamAlert.this ,OpenJobList.class);
                startActivity(myIntent);



            }
        });

        alljobexamdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(JobExamAlert.this ,AllJobExamDate.class);
                startActivity(myIntent);



            }
        });


        jobexamalertb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(JobExamAlert.this ,JobsExamAlertb2.class);
                startActivity(myIntent);



            }
        });

        saveducument.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(JobExamAlert.this ,SaveDucument.class);
                startActivity(myIntent);


            }
        });

        savecv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(JobExamAlert.this ,SaveCv.class);
                startActivity(myIntent);

            }
        });


    }
}