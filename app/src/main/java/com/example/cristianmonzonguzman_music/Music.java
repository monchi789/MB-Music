package com.example.cristianmonzonguzman_music;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Music extends AppCompatActivity {

    // Declare the buttons
    Button btnBack;

    // Declare ListView
    ListView ltList;

    // Static String music
    static String music = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        // Set ListView
        ltList = findViewById(R.id.ltList);
        btnBack = findViewById(R.id.btnBack);

        // Get the parameter
        music = getIntent().getStringExtra("music");

        // Define the method OnClick
        btnBack.setOnClickListener(view -> Callback());

        // Valid the parameter
        switch (music) {

            case "classic":
                ChargeClassic();
                break;

            case "rock":
                ChargeRock();
                break;

            case "funk":
                ChargeFunk();
                break;

            case "jazz":
                ChargeJazz();
                break;

            case "pop":
                ChargePop();
                break;

            default:
        }


    }

    // Define the methods

    private void Callback() {

        Intent vBack = new Intent(Music.this, Task.class);
        startActivity(vBack);

    }

    private void ChargeClassic() {

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(Music.this, R.array.classic_music,
                        android.R.layout.simple_list_item_1);

        ltList.setAdapter(adapter);

    }

    private void ChargeRock() {

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(Music.this, R.array.rock_music,
                        android.R.layout.simple_list_item_1);

        ltList.setAdapter(adapter);

    }

    private void ChargeFunk() {

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(Music.this, R.array.funk_music,
                        android.R.layout.simple_list_item_1);

        ltList.setAdapter(adapter);

    }

    private void ChargeJazz() {

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(Music.this, R.array.jazz_music,
                        android.R.layout.simple_list_item_1);

        ltList.setAdapter(adapter);

    }

    private void ChargePop() {

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(Music.this, R.array.pop_music,
                        android.R.layout.simple_list_item_1);

        ltList.setAdapter(adapter);

    }
}