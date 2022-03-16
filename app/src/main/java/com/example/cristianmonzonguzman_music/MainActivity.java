package com.example.cristianmonzonguzman_music;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declare the buttons
    Button btnTask, btnActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the buttons
        btnActivity = findViewById(R.id.btnActivity);
        btnTask = findViewById(R.id.btnTask);

        // Define the methods OnClick
        btnActivity.setOnClickListener(view -> CallActivity());

        btnTask.setOnClickListener(view -> CallTask());

    }

    // Define the methods
    private void CallActivity(){

        Intent vActivity = new Intent(this, Activity.class);
        startActivity(vActivity);

    }

    private void CallTask(){

        Intent vTask = new Intent(this, Task.class);
        startActivity(vTask);
    }
}