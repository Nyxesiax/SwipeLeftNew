package com.example.swipeleft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

public class LikedList extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liked_list);

        Log.d("LikedList", "LikedList erreicht");
        Intent intent = getIntent();
        ArrayList<String> arrayList = intent.getStringArrayListExtra("passedArrayList");
/*
        for( int i = 0; i < arrayList.size(); i++ )
        {
            Log.d("Arraylist in LikedList Class", arrayList.get(i));
            TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(220, 20);
            TextView textView = new TextView(this);
            textView.setLayoutParams(layoutParams);

            textView.setTextSize(16);
            textView.setText(arrayList.get(i));
        }
        finish();
        startActivity(getIntent());*/
    }
}
