package com.whydanu.onboardinganimatedlottie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void masuk3(View view) {
        Intent masuk3 = new Intent(ThirdActivity.this, FourActivity.class);
        startActivity(masuk3);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }

    //@Override
    //public void finish() {
        //super.finish();
       // overridePendingTransition(R.anim.slide_out_left, R.anim.slide_out_right);
    }
