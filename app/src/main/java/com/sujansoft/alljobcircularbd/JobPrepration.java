package com.sujansoft.alljobcircularbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class JobPrepration extends AppCompatActivity {

    LinearLayout mcq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.job_prepration);

        mcq = findViewById(R.id.mcq);




        mcq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(JobPrepration.this , McqLetion.class);
                startActivity(myIntent);


            }
        });



    }
}