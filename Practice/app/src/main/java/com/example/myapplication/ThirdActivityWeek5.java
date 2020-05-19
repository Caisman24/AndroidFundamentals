package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivityWeek5 extends AppCompatActivity {
    static final String EXTRA_DATA = "extra_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_week5);

        Button finishThirdActivity = findViewById(R.id.finish_third_activity);

        finishThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent finishThird = new Intent();
                finishThird.putExtra(EXTRA_DATA, "Yey we Got it");
                setResult(Activity.RESULT_OK, finishThird);
                finish();
            }
        });
    }
}
