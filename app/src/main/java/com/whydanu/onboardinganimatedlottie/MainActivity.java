package com.whydanu.onboardinganimatedlottie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    ///button pindah activity
    public void masukmain(View view) {
        Intent masuk1 = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(masuk1);
        //animasinya
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

    }
}