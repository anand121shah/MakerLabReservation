package com.example.makerlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class printer_reservation extends AppCompatActivity {

    private WebView webPrinter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_printer_reservation);
        webPrinter = findViewById(R.id.web_printer);
        WebSettings webSettingPrinter = webPrinter.getSettings();
        webSettingPrinter.setJavaScriptEnabled(true);
        webPrinter.loadUrl("https://formlab2a.youcanbook.me/");

        webPrinter.setWebViewClient(new WebViewClient());

        getSupportActionBar().setTitle("3D Printer Reservation Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(webPrinter.canGoBack())
            webPrinter.goBack();
        else
            super.onBackPressed();
    }
}
