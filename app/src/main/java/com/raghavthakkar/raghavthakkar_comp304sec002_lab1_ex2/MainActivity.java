package com.raghavthakkar.raghavthakkar_comp304sec002_lab1_ex2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.raghavthakkar.raghavthakkar_comp304sec002_lab1_ex2.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private BottomFragment bottomFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_home_24);
        getSupportActionBar().setTitle("Exercise 2");

        if (savedInstanceState==null) {
            getSupportFragmentManager().executePendingTransactions();
            bottomFragment = (BottomFragment) getSupportFragmentManager().findFragmentById(R.id.bottom);
            bottomFragment.displayData("On Create\n");
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        bottomFragment.displayData(" OnStart\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        bottomFragment.displayData(" Stop\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bottomFragment.displayData(" Destroy\n");
    }
}