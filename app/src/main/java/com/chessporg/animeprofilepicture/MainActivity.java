package com.chessporg.animeprofilepicture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    String[] names;
    String[] animes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);
        names = getResources().getStringArray(R.array.character_name);
        animes = getResources().getStringArray(R.array.anime_name);

        myListView.setAdapter(new ItemAdapter(this, names, animes));

    }
}
