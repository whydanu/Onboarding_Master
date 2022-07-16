package com.whydanu.onboardinganimatedlottie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
    }
    ///button pindah activity
    public void masuk5(View view) {
        Intent masuk5 = new Intent(FiveActivity.this,MainActivity.class);
        startActivity(masuk5);
        //animasinya
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }
}