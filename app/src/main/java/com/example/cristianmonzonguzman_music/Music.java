package com.example.cristianmonzonguzman_music;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Music extends AppCompatActivity {

    // Declare the buttons
    Button btnBack;

    // Declare ListView
    ListView ltList;

    // Declare String
    String name = "";

    // Declare the textView
    TextView txtAuthor;

    // Static String music
    static String music = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        // Set the items
        ltList = findViewById(R.id.ltList);
        btnBack = findViewById(R.id.btnBack);
        txtAuthor = findViewById(R.id.txtAuthor);

        // Get the parameter
        music = getIntent().getStringExtra("music");

        // Define the method OnClick
        btnBack.setOnClickListener(view -> Callback());

        ltList.setOnItemClickListener((adapterView, view, i, l) -> {

            // Get the name of item in listView
            name = ltList.getItemAtPosition(i).toString();

            // Set text
            txtAuthor.setText(name);

            // Delete the spacing and replace by "_"
            name = name.replaceAll(" ", "_").toLowerCase(Locale.ROOT);

            Log.d("Name: ", name);


            // Get the resources
            int resID = getResources().getIdentifier(name, "raw", getPackageName());
            CallMusic(resID);

            Log.i("Position: ", String.valueOf(i));

        });

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

    private void CallMusic(int path){
        MediaPlayer mp = MediaPlayer.create(Music.this, path);
        mp.start();

    }

}