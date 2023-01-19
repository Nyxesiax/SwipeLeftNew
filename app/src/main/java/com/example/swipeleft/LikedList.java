package com.example.swipeleft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ArrayAdapter;

import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

public class LikedList extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liked_list);

//        Toolbar toolbar = findViewById(R.id.toolbar_backbtn);
//        setSupportActionBar(toolbar);

        ImageView back = findViewById(R.id.backbtn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LikedList.this, "back btn pressed.", Toast.LENGTH_SHORT).show();
            }
        });

        Log.d("LikedList", "LikedList erreicht");
        Intent intent = getIntent();
        ArrayList<String> arrayList = intent.getStringArrayListExtra("passedArrayList");
        ListView listView = findViewById(R.id.listView);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);
    }
}
