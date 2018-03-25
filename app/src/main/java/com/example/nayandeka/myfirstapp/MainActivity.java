package com.example.nayandeka.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    GridLayout maingrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maingrid = (GridLayout) findViewById(R.id.maingrid);

        setSingleEvent(maingrid);
    }

    private void setSingleEvent(GridLayout maingrid) {

        for (int i = 0; i < maingrid.getChildCount(); i++) {

            CardView cardview = (CardView) maingrid.getChildAt(i);
            if (i == 0) {

                cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.nayandeka.civil_activity");
                        startActivity(intent);
                    }
                });
            }
            else if (i==1){
                cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.nayandeka.Mechanical_Activity");
                        startActivity(intent);
                    }
                });
            }
            else if (i==2){
                cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.nayandeka.Electrical_activity");
                        startActivity(intent);
                    }
                });
            }
            else if (i==3){
                cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.nayandeka.ECE_activity");
                        startActivity(intent);
                    }
                });
            }
            else if(i==4){
                cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.nayandeka.cse_activity");
                        startActivity(intent);
                    }
                });
            }
            else {
                cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.nayandeka.eie_activity");
                        startActivity(intent);
                    }
                });
            }



        }
    }
}
