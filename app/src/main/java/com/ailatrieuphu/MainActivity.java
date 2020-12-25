package com.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bnt_start_now;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bindId();
    }

    public void bindId (){
        bnt_start_now = findViewById(R.id.bnt_start_now);
    }

    public void onStartNow(View view) {
        Intent i = new Intent(this, PlayGameActivity.class);
        startActivity(i);
    }

    public void onContributeQuestions(View view) {
        Intent i = new Intent(this, ContributeQuestionsActivity.class);
        startActivity(i);
    }
}