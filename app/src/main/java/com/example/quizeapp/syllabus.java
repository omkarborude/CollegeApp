package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class syllabus extends AppCompatActivity {

    private ImageButton s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        s1 = findViewById(R.id.sem1);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opens1();
            }
        });

    }
    public void opens1(){
        Intent intent = new Intent(this, s1s.class);
        startActivity(intent);
    }
}
