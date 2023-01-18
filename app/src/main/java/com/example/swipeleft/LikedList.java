package com.example.swipeleft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class LikedList extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liked_list);

        Log.d("LikedList", "LikedList erreicht");
        ArrayList<Videos> arrayList = (ArrayList<Videos>) getIntent().getSerializableExtra("passedArrayList");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        for( int i = 0; i < arrayList.size(); i++ )
        {
            Log.d("Arraylist in LikedList Class", arrayList.get(i).getVideoTitle());
            TextView textView = new TextView(this);
            textView.setText(arrayList.get(i).getVideoTitle());
            linearLayout.addView(textView);
        }
    }



}
