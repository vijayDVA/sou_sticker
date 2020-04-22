package com.sourashtra.samplestickerapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(() -> {
            Intent i = new Intent(splash.this, EntryActivity.class); startActivity(i);
            finish(); }, 3000);
    }


}

