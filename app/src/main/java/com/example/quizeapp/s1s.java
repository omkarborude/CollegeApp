package com.example.myapplication;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;


public class s1s extends AppCompatActivity {

    PDFView s1s;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1s);

        s1s = (PDFView) findViewById(R.id.s1s);

        s1s.fromAsset("pdf.pdf").load();








    }

}
