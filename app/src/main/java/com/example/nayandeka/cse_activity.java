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

public class cse_activity extends AppCompatActivity {
    private RadioGroup r_g;
    private RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_activity);
        onClickLstener();
    }

    public void onClickLstener(){
        r_g=(RadioGroup)findViewById(R.id.radio_gp);
        button2=(Button)findViewById(R.id.button_cs);
        rb1=(RadioButton)findViewById(R.id.rbcs1);
        rb2=(RadioButton)findViewById(R.id.rbcs2);
        rb3=(RadioButton)findViewById(R.id.rbcs3);
        rb4=(RadioButton)findViewById(R.id.rbcs4);
        rb5=(RadioButton)findViewById(R.id.rbcs5);
        rb6=(RadioButton)findViewById(R.id.rbcs6);
        rb7=(RadioButton)findViewById(R.id.rbcs7);
        rb8=(RadioButton)findViewById(R.id.rbcs8);


        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selected_id=r_g.getCheckedRadioButtonId();
                        if (selected_id==rb1.getId())
                        {
                            Intent intent=new Intent("com.example.nayandeka.cs_1");
                            startActivity(intent);

                        }
                        else if (selected_id==rb2.getId())
                        {
                            Intent intent=new Intent("com.example.nayandeka.cs_2");
                            startActivity(intent);
                        }
                        else if (selected_id==rb3.getId())
                        {
                            Intent intent=new Intent("com.example.nayandeka.cs_3");
                            startActivity(intent);
                        }
                        else if (selected_id==rb4.getId())
                        {

                            Intent intent=new Intent("com.example.nayandeka.cs_4");
                            startActivity(intent);
                        }
                        else if (selected_id==rb5.getId())
                        {

                            Intent intent=new Intent("com.example.nayandeka.cs_5");
                            startActivity(intent);
                        }
                        else if (selected_id==rb6.getId())
                        {

                            Intent intent=new Intent("com.example.nayandeka.cs_6");
                            startActivity(intent);
                        }
                        else if (selected_id==rb7.getId())
                        {

                            Intent intent=new Intent("com.example.nayandeka.cs_7");
                            startActivity(intent);
                        }
                        else if (selected_id==rb8.getId())
                        {

                            Intent intent=new Intent("com.example.nayandeka.cs_8");
                            startActivity(intent);
                        }
                        else
                        {
                            Toast.makeText(cse_activity.this,"plese select an option",Toast.LENGTH_SHORT).show();
                        }

                    }
                }
        );

    }


}

