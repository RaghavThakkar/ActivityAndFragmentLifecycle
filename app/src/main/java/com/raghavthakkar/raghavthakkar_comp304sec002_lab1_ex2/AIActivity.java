package com.raghavthakkar.raghavthakkar_comp304sec002_lab1_ex2;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.raghavthakkar.raghavthakkar_comp304sec002_lab1_ex2.databinding.ActivityAiactivityBinding;


public class AIActivity extends AppCompatActivity {

    private ActivityAiactivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAiactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setText("Create");
        Log.d("tv", "OnCreate");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Exercise 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        setText("Start");
        Log.d("tv", "OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        setText("Stop");
        Log.d("tv", "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setText("Destroy");

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void setText(String text) {
        binding.tv.setText(binding.tv.getText() + text + "\n\n");
    }
}