package com.example.swipeleft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class GenresActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        Intent intent = getIntent();
        ArrayList<String> arrayList = intent.getStringArrayListExtra("passedArrayList");
        ListView listView = findViewById(R.id.genreList);

    }
}
