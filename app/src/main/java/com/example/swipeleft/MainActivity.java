package com.example.swipeleft;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.swipeleft.databinding.ActivityMainBinding;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private Videos videoToPlay = Videos.A;
    public ArrayList<Videos> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        Button likeButton = (Button) findViewById(R.id.likeButton);
        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList.add(videoToPlay);
               Log.d("Current Video", videoToPlay.getVideoTitle());
               // getNextVideo(videoToPlay);
                getNextVideo(videoToPlay);
                Log.d("Next Video", videoToPlay.getVideoTitle());

                Log.d("da", videoToPlay.getVideoTitle());
                playYoutubeVideo(youTubePlayerView, videoToPlay);

                /*youTubePlayerView.getYouTubePlayerWhenReady(youTubePlayer -> {
                    youTubePlayer.loadVideo(videoToPlay.getVideoId(), 0);
                    ((TextView) findViewById(R.id.video_title)).setText(videoToPlay.getVideoTitle());
                }); */
            }
        });

        Button downButton = (Button) findViewById(R.id.dislikeButton);
        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Current Video", videoToPlay.getVideoTitle());
                // getNextVideo(videoToPlay);
                getNextVideo(videoToPlay);
                Log.d("Next Video", videoToPlay.getVideoTitle());

                Log.d("da", videoToPlay.getVideoTitle());

                playYoutubeVideo(youTubePlayerView, videoToPlay);
            }
        });


            youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    youTubePlayer.loadVideo(videoToPlay.getVideoId(), 0);
                    ((TextView) findViewById(R.id.video_title)).setText(videoToPlay.getVideoTitle());
                }
            });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    private void getNextVideo(Videos lastVideo){
        while (lastVideo.equals(videoToPlay)){
            videoToPlay = Videos.randomLetter();
        }
    }

    private void playYoutubeVideo(YouTubePlayerView youtubeView, Videos currentVideo) {
        youtubeView.getYouTubePlayerWhenReady(youTubePlayer -> {
            youTubePlayer.loadVideo(currentVideo.getVideoId(), 0);
            ((TextView) findViewById(R.id.video_title)).setText(currentVideo.getVideoTitle());
        });
    }
}