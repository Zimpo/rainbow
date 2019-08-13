package com.zimpo.mysik.rainbow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class StoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);

        RecyclerView searchRV = (RecyclerView) findViewById(R.id.storyRV);
        StoryAdapter storyAdapter = new StoryAdapter(getApplicationContext(), new StoryAdapter.OnItemClickListener() {
            @Override
            public void onItemClickListener(String story) {
                Intent intent = new Intent(getApplicationContext(), StoryActivity.class);
                intent.putExtra("EXTRA_STORY", story);
                startActivity(intent);
            }
        });
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        searchRV.setLayoutManager(linearLayoutManager);
        searchRV.setAdapter(storyAdapter);


        ArrayList<String> stories = new ArrayList<>();
        stories.add("Le Léprechaun et le chaudron d'or");
        stories.add("L'expérience de Mary");
        stories.add("Symbolisme des couleurs");
        stories.add("Le magicien des couleurs");
        stories.add("La Toison d'Or");
        stories.add("Qu'est ce que la couleur ?");
        storyAdapter.insertAll(stories);
    }

}
