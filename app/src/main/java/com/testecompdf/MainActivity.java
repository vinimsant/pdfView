package com.testecompdf;

import androidx.appcompat.app.AppCompatActivity;

import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageScrollListener;

public class MainActivity extends AppCompatActivity {

    PDFView myPdf;
    int page = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        myPdf = (PDFView) findViewById(R.id.pdfViewer);
        myPdf.fromAsset("pdf.pdf").defaultPage(page).load();


    }



}