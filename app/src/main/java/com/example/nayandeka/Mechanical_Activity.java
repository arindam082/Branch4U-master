package com.example.nayandeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.nayandeka.myfirstapp.R;

public class Mechanical_Activity extends AppCompatActivity {
    private RadioGroup r_gm;
    private RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical_);
        onClickLstener();
    }



    public void onClickLstener(){
        r_gm=(RadioGroup)findViewById(R.id.radio_gp);
        button2=(Button)findViewById(R.id.button_m);
        rb1=(RadioButton)findViewById(R.id.rbm1);
        rb2=(RadioButton)findViewById(R.id.rbm2);
        rb3=(RadioButton)findViewById(R.id.rbm3);
        rb4=(RadioButton)findViewById(R.id.rbm4);
        rb5=(RadioButton)findViewById(R.id.rbm5);
        rb6=(RadioButton)findViewById(R.id.rbm6);
        rb7=(RadioButton)findViewById(R.id.rbm7);
        rb8=(RadioButton)findViewById(R.id.rbm8);


        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selected_id=r_gm.getCheckedRadioButtonId();
                        if (selected_id==rb1.getId())
                        {
                            Intent intent=new Intent("com.example.nayandeka.c_1");
                            startActivity(intent);

                        }
                        else if (selected_id==rb2.getId())
                        {
                            Intent intent=new Intent("com.example.nayandeka.c_2");
                            startActivity(intent);
                        }
                        else if (selected_id==rb3.getId())
                        {
                            Intent intent=new Intent("com.example.nayandeka.c_3");
                            startActivity(intent);
                        }
                        else if (selected_id==rb4.getId())
                        {

                            Intent intent=new Intent("com.example.nayandeka.c_4");
                            startActivity(intent);
                        }
                        else if (selected_id==rb5.getId())
                        {

                            Intent intent=new Intent("com.example.nayandeka.c_5");
                            startActivity(intent);
                        }
                        else if (selected_id==rb6.getId())
                        {

                            Intent intent=new Intent("com.example.nayandeka.c_6");
                            startActivity(intent);
                        }
                        else if (selected_id==rb7.getId())
                        {

                            Intent intent=new Intent("com.example.nayandeka.c_7");
                            startActivity(intent);
                        }
                        else if (selected_id==rb8.getId())
                        {

                            Intent intent=new Intent("com.example.nayandeka.c_8");
                            startActivity(intent);
                        }
                        else
                        {
                            Toast.makeText(Mechanical_Activity.this,"plese select an option",Toast.LENGTH_SHORT).show();
                        }

                    }
                }
        );

    }


}

