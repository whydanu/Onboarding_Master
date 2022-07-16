package com.whydanu.onboardinganimatedlottie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void masuk2(View view) {
        Intent masuk2 = new Intent(SecondActivity.this,ThirdActivity.class);
        startActivity(masuk2);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

    }

    //@Override
   // public void finish() {
     //   super.finish();
     //   overridePendingTransition(R.anim.slide_out_left,R.anim.slide_out_left);
    }
