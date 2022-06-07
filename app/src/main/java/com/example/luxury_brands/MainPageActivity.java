package com.example.luxury_brands;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPageActivity extends AppCompatActivity {

    Button shoes, men, women, access,viewall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        shoes=findViewById(R.id.Shoesbtn);
        access=findViewById(R.id.Accessbtn);
        women=findViewById(R.id.Womenbtn);
        men=findViewById(R.id.Menbtn);
        viewall=findViewById(R.id.ViewAllbtn);
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