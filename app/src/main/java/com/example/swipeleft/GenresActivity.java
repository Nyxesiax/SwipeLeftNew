package com.example.swipeleft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class GenresActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        Intent intent = getIntent();
        ArrayList<String> arrayList = intent.getStringArrayListExtra("passedArrayList");
        Collections.sort(arrayList);
        ListView listView = findViewById(R.id.genreList);

        ArrayAdapter listAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(listAdapter);

    }
}
