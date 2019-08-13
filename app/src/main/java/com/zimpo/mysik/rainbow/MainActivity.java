package com.zimpo.mysik.rainbow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        int r = rand.nextInt(6);

        RelativeLayout gameRL = (RelativeLayout) findViewById(R.id.gameRL);
        RelativeLayout storyRL = (RelativeLayout) findViewById(R.id.storyRL);
        RelativeLayout aboutRL = (RelativeLayout) findViewById(R.id.aboutRL);

        switch (r)
        {
            case 0:
                gameRL.setBackgroundColor(getResources().getColor(R.color.colorRed));
                storyRL.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                aboutRL.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                break;
            case 1:
                gameRL.setBackgroundColor(getResources().getColor(R.color.colorBrown));
                storyRL.setBackgroundColor(getResources().getColor(R.color.colorGray));
                aboutRL.setBackgroundColor(getResources().getColor(R.color.colorPink));
                break;
            case 2:
                gameRL.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                storyRL.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                aboutRL.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                break;
            case 3:
                gameRL.setBackgroundColor(getResources().getColor(R.color.colorOrange));
                storyRL.setBackgroundColor(getResources().getColor(R.color.colorPurple));
                aboutRL.setBackgroundColor(getResources().getColor(R.color.colorRed));
                break;
            case 4:
                gameRL.setBackgroundColor(getResources().getColor(R.color.colorOrange));
                storyRL.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                aboutRL.setBackgroundColor(getResources().getColor(R.color.colorRed));
                break;
            case 5:
                gameRL.setBackgroundColor(getResources().getColor(R.color.colorRed));
                storyRL.setBackgroundColor(getResources().getColor(R.color.colorPink));
                aboutRL.setBackgroundColor(getResources().getColor(R.color.colorPurple));
                break;
            default:
                gameRL.setBackgroundColor(getResources().getColor(R.color.colorRed));
                storyRL.setBackgroundColor(getResources().getColor(R.color.colorPurple));
                aboutRL.setBackgroundColor(getResources().getColor(R.color.colorPink));
                break;
        }

        gameRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ColorActivity.class);
                startActivity(intent);
            }
        });

        storyRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), StoriesActivity.class);
                startActivity(intent);
            }
        });

        aboutRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Oups bientôt disponible.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
