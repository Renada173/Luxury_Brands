package com.example.luxury_brands;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ShoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes);
    }
    public void goToViewAllPage(View view) {
        Intent i = new Intent(this, MainPageActivity.class);
        startActivity(i);
    }

    public void goToAccessPage(View view) {
        Intent i = new Intent(this, AccessActivity.class);
        startActivity(i);
    }

    public void goToWomenPage(View view) {
        Intent i = new Intent(this, WomenActivity.class);
        startActivity(i);
    }

    public void goToShoesPage(View view) {
        Intent i = new Intent(this, ShoesActivity.class);
        startActivity(i);
    }

    public void goToMenPage(View view) {
        Intent i = new Intent(this, MenActivity.class);
        startActivity(i);
    }
}