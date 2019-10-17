package com.example.makerlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton bossButton;
    private ImageButton cncButton;
    private ImageButton printerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cncButton = findViewById(R.id.cnc_button);
        cncButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCncActivity();
            }
        });

        printerButton = findViewById(R.id.printer_button);
        printerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrinterActivity();
            }
        });

        bossButton = findViewById(R.id.laser_button);
        bossButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBossActivity();
            }
        });
    }

    public void openCncActivity(){
        Intent intent = new Intent(this, cnc_reservation.class);
        startActivity(intent);
    }

    public void openPrinterActivity(){
        Intent intent = new Intent(this, printer_reservation.class);
        startActivity(intent);
    }

    public void openBossActivity(){
        Intent intent = new Intent(this, boss_reservation.class);
        startActivity(intent);
    }
}
