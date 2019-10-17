package com.example.makerlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class cnc_reservation extends AppCompatActivity {
    private WebView webCnc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnc_reservation);

        webCnc = findViewById(R.id.web_cnc);
        WebSettings webSettingCnc = webCnc.getSettings();
        webSettingCnc.setJavaScriptEnabled(true);
        webCnc.loadUrl("https://cncrouter.youcanbook.me/");

        webCnc.setWebViewClient(new WebViewClient());

        getSupportActionBar().setTitle("CNC Router Reservation Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(webCnc.canGoBack())
            webCnc.goBack();
        else
            super.onBackPressed();
    }

}
