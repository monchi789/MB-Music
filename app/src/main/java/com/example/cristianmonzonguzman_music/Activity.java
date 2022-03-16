package com.example.cristianmonzonguzman_music;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Activity extends AppCompatActivity {

    // Declare the imageButtons
    ImageButton btnCat, btnDog;

    // Declare the buttons
    Button btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);

        // Set the imageButtons
        btnCat = findViewById(R.id.btnCat);
        btnDog = findViewById(R.id.btnDog);

        // Set the Buttons
        btnBack = findViewById(R.id.btnBack);

        // Define the methods OnClick
        btnCat.setOnClickListener(view -> {

            MediaPlayer mp = MediaPlayer.create(Activity.this, R.raw.miau);
            mp.start();

        });

        btnDog.setOnClickListener(view -> {

            MediaPlayer mp = MediaPlayer.create(Activity.this, R.raw.ladra);
            mp.start();

        });

        btnBack.setOnClickListener(view -> CallBack());

    }

    private void CallBack() {

        Intent vBack = new Intent(Activity.this, MainActivity.class);
        startActivity(vBack);
    }
}