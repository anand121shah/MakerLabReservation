package com.example.makerlab;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class boss_reservation extends AppCompatActivity {
    private WebView webBoss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss_reservation);

        webBoss = findViewById(R.id.web_boss);
        WebSettings webSettingBoss = webBoss.getSettings();
        webSettingBoss.setJavaScriptEnabled(true);
        webBoss.loadUrl("https://bosslaser.youcanbook.me/");

        webBoss.setWebViewClient(new WebViewClient());

        getSupportActionBar().setTitle("Boss Laser Reservation Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(webBoss.canGoBack())
            webBoss.goBack();
        else
            super.onBackPressed();
    }
}