package com.example.interactivestoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {

    private TextView textView;

    private static final String TAG = StoryActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getResources().getString(R.string.name));
        textView = findViewById(R.id.textView);
        textView.setText(name);
        Log.d(TAG, name);
    }
}