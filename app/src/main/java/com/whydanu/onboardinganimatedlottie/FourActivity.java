package com.whydanu.onboardinganimatedlottie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }

    public void masuk4(View view) {
        Intent masuk4 = new Intent(FourActivity.this, FiveActivity.class);
        startActivity(masuk4);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }

    //@Override
    //public void finish() {
       // super.finish();
       // overridePendingTransition(R.anim.slide_out_left, R.anim.slide_out_right);
    }
