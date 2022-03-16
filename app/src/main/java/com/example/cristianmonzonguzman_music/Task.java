package com.example.cristianmonzonguzman_music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Task extends AppCompatActivity {

    // Declare the buttons
    Button btnBack;

    // Declare the ImageButton
    ImageButton btnRock;
    ImageButton btnClassic;
    ImageButton btnFunk;
    ImageButton btnJazz;
    ImageButton btnPop;

    // Static String
    static String music = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        // Set the buttons
        btnBack = (Button) findViewById(R.id.btnBack);
        btnClassic = (ImageButton) findViewById(R.id.btnClassic);
        btnRock = (ImageButton) findViewById(R.id.btnRock);
        btnFunk = (ImageButton) findViewById(R.id.btnFunk);
        btnJazz = (ImageButton) findViewById(R.id.btnJazz);
        btnPop = (ImageButton) findViewById(R.id.btnPop);

        // Define the methods OnClick
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallBack();
            }
        });

        // Define the Methods OnClick
        btnClassic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ChargeClassic();

            }
        });

        btnRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ChargeRock();

            }
        });

        btnFunk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ChargeFunk();

            }
        });

        btnJazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ChargeJazz();

            }
        });

        btnPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ChargePop();

            }
        });


    }

    // Define the methods
    private void CallBack() {
        Intent vBack = new Intent(Task.this, MainActivity.class);
        startActivity(vBack);
    }

    private void ChargeClassic() {

        music = "classic";

        Intent vClassic = new Intent(Task.this, Music.class);
        vClassic.putExtra("music", music);
        startActivity(vClassic);

    }

    private void ChargeRock() {

        music = "rock";

        Intent vRock = new Intent(Task.this, Music.class);
        vRock.putExtra("music", music);
        startActivity(vRock);

    }

    private void ChargeFunk() {

        music = "funk";

        Intent vFunk = new Intent(Task.this, Music.class);
        vFunk.putExtra("music", music);
        startActivity(vFunk);

    }

    private void ChargeJazz() {

        music = "jazz";

        Intent vJazz = new Intent(Task.this, Music.class);
        vJazz.putExtra("music", music);
        startActivity(vJazz);

    }

    private void ChargePop() {

        music = "pop";

        Intent vPop = new Intent(Task.this, Music.class);
        vPop.putExtra("music", music);
        startActivity(vPop);

    }
}