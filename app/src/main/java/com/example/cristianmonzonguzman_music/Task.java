package com.example.cristianmonzonguzman_music;

import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

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
        btnBack = findViewById(R.id.btnBack);
        btnClassic = findViewById(R.id.btnClassic);
        btnRock = findViewById(R.id.btnRock);
        btnFunk = findViewById(R.id.btnFunk);
        btnJazz = findViewById(R.id.btnJazz);
        btnPop = findViewById(R.id.btnPop);

        // Define the methods OnClick
        btnBack.setOnClickListener(view -> CallBack());

        // Define the Methods OnClick
        btnClassic.setOnClickListener(view -> ChargeClassic());

        btnRock.setOnClickListener(view -> ChargeRock());

        btnFunk.setOnClickListener(view -> ChargeFunk());

        btnJazz.setOnClickListener(view -> ChargeJazz());

        btnPop.setOnClickListener(view -> ChargePop());


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