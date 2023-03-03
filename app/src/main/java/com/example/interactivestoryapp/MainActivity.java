package com.example.interactivestoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nameField;
    private Button startbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = findViewById(R.id.nameEditText);
        startbutton = findViewById(R.id.startButton);

        startbutton.setOnClickListener(v -> {
            String name = nameField.getText().toString();
//                Toast.makeText(MainActivity.this, name, Toast.LENGTH_LONG).show();

            startStory(name);
        });
    }

    private void startStory(String name) {
        Intent intent = new Intent(MainActivity.this, StoryActivity.class);
        getResources().getString(R.string.name);
        intent.putExtra("Name", name);
        if(!name.isEmpty()) {
            startActivity(intent);
        } else {
            Toast.makeText(MainActivity.this, "Name cannot be empty", Toast.LENGTH_LONG).show();
        }
    }
}