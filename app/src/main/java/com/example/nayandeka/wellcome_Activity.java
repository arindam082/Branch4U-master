package com.example.nayandeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.nayandeka.myfirstapp.R;

public class wellcome_Activity extends AppCompatActivity {
    LinearLayout l1,l2;
    Button b1;
    Animation uptodown,downtoup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome_);
        b1=(Button)findViewById(R.id.buttonW);
        l1=(LinearLayout)findViewById(R.id.L1);
        l2=(LinearLayout)findViewById(R.id.L2);
        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup= AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l1.setAnimation(uptodown);
        l2.setAnimation(downtoup);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.nayandeka.myfirstapp.MainActivity");
                        startActivity(intent);
                    }
                }
        );
    }
}
