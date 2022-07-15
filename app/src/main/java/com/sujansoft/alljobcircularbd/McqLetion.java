package com.sujansoft.alljobcircularbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class McqLetion extends AppCompatActivity {

    LinearLayout analytical,computer,englishbank,general,internatinal,mathbank,generalmath,banglamcq,banglabank,bangladeshaffairs,GeneralKnowledge,GeneralScience;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mcq_letion);

        analytical = findViewById(R.id.analytical);
        computer = findViewById(R.id.computer);
        englishbank = findViewById(R.id.englishbank);
        general = findViewById(R.id.general);
        internatinal = findViewById(R.id.internatinal);
        mathbank = findViewById(R.id.mathbank);
        generalmath = findViewById(R.id.generalmath);
        banglamcq = findViewById(R.id.banglamcq);
        banglabank = findViewById(R.id.banglabank);
        bangladeshaffairs = findViewById(R.id.bangladeshaffairs);
        GeneralKnowledge = findViewById(R.id.GeneralKnowledge);
        GeneralScience = findViewById(R.id.GeneralScience);




        analytical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(McqLetion.this , AnalyticalMcq.class);
                startActivity(myIntent);


            }
        });


        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(McqLetion.this , ComputerMcq.class);
                startActivity(myIntent);


            }
        });


        englishbank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(McqLetion.this , EnglishBank.class);
                startActivity(myIntent);


            }
        });


        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(McqLetion.this , GeneralEnglish.class);
                startActivity(myIntent);


            }
        });


        internatinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(McqLetion.this , InternatinalAffairs.class);
                startActivity(myIntent);


            }
        });


        mathbank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(McqLetion.this , MathBank.class);
                startActivity(myIntent);


            }
        });


        generalmath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(McqLetion.this , GeneralMath.class);
                startActivity(myIntent);


            }
        });

        banglamcq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(McqLetion.this , BanglaMcq.class);
                startActivity(myIntent);


            }
        });


        banglabank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(McqLetion.this , BanglaBank.class);
                startActivity(myIntent);


            }
        });

        bangladeshaffairs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(McqLetion.this , BangladeshAffairs.class);
                startActivity(myIntent);


            }
        });

        GeneralKnowledge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(McqLetion.this , GeneralKnowledge.class);
                startActivity(myIntent);


            }
        });

        GeneralScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(McqLetion.this , GeneralScience.class);
                startActivity(myIntent);


            }
        });




    }
}