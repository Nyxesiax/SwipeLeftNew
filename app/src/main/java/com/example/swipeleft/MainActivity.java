package com.example.swipeleft;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
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
    private Videos videoToPlay = Videos.GAMEOFTHRONES;
    public ArrayList<String> acceptedArrayList = new ArrayList<>();
    private ArrayList<String> genreList = new ArrayList<>();
    public ArrayList<Videos> alreadySeen = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        genreList.add(0, "Thriller");
        genreList.add(1, "Horror");
        genreList.add(2, "Drama");
        genreList.add(3, "Komödie");
        genreList.add(4, "Sci-Fi");
        genreList.add(5, "Krimi");
        genreList.add(6, "Krieg");
        genreList.add(7, "Fantasy");
        genreList.add(8, "Abenteuer");

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        ImageView menuIcon = findViewById(R.id.menu_icon);
//        ImageView filterIcon = findViewById(R.id.filter_icon);
        TextView title = findViewById(R.id.toolbar_title);
        //onOptionsItemSelected(itemView);
        /*itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "liked list bitte aufrufen!", Toast.LENGTH_SHORT).show();

                Log.d("Message", "Bin drin");
                Intent intent = new Intent(MainActivity.this ,
                        LikedList.class);
                intent.putExtra("passedArrayList", arrayList);
                startActivity(intent);
                //  setContentView(R.layout.liked_list);
            }
        });//cock*/

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        Button likeButton = findViewById(R.id.likeButton);
        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alreadySeen.add(videoToPlay);
                acceptedArrayList.add(videoToPlay.getVideoTitle());
               Log.d("Current Video", videoToPlay.getVideoTitle());
               // getNextVideo(videoToPlay);
                getNextVideo(videoToPlay);
                Log.d("Next Video", videoToPlay.getVideoTitle());

                Log.d("da", videoToPlay.getVideoTitle());
                playYoutubeVideo(youTubePlayerView, videoToPlay);
//                Log.d("enum test", Videos.valueOf("KPLWWIOCOOQ").toString());
            }
        });


        Button downButton = findViewById(R.id.dislikeButton);
        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alreadySeen.add(videoToPlay);
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
        if (id == R.id.action_liked) {
            Intent intent = new Intent(MainActivity.this ,
                    LikedList.class);
            intent.putExtra("passedArrayList", acceptedArrayList);
            startActivity(intent);
            Log.d("bla", "list selected");
            return true;
        } else if (id == R.id.action_filter) {
            Intent intent = new Intent(MainActivity.this ,
                    GenresActivity.class);
            intent.putExtra("passedArrayList", genreList);
            startActivity(intent);
            Log.d("bla", "list selected");
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
//            ((TextView) findViewById(R.id.video_rating)).setText(currentVideo.getBewertung());
//            ((TextView) findViewById(R.id.video_release)).setText(currentVideo.getJahr());
        });
    }
}