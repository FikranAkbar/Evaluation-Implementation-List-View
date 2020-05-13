package com.chessporg.animeprofilepicture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showDetailActivity = new Intent(getApplication(), DetailActivity.class);
                showDetailActivity.putExtra("com.chessporg.ITEM_INDEX", position);
                startActivity(showDetailActivity);
            }
        });

    }
}
