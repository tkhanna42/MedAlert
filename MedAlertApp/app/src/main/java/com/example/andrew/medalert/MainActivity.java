package com.example.andrew.medalert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        Button stages = (Button) findViewById(R.id.stages);
        Button pReg = (Button) findViewById(R.id.pReg);
        Button symptoms = (Button) findViewById(R.id.symptoms);
        Button alert = (Button) findViewById(R.id.alert);

        stages.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), Stages.class);
                startActivity(intent);

            }
        });

        pReg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), PatientRegistration.class);
                startActivity(intent);
            }
        });

        symptoms.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), Symptoms.class);
                startActivity(intent);
            }
        });

        alert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), Alerts.class);
                startActivity(intent);
            }
        });
    }
}
