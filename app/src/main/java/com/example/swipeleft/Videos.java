package com.example.swipeleft;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Videos {

    GAMEOFTHRONES("dcFIvnj8_UI", "Game of Thrones", new String[]{"Drama", "Fantasy"}),
    BREAKINGBAD("ceqOTZnhgY8", "Breaking Bad", new String[]{"Drama"}),
    SHERLOCK("ofG0IIFe5rc", "Sherlock", new String[]{"Abenteuer", "Krimi", "Drama"}),
    THEMANDALORIAN("V2ZxSJy_BOQ", "The Mandalorian", new String[]{"Abenteuer", "Sci-Fi"}),
    CHERNOBYL("dsWF6vC8zpY", "Chernobyl", new String[]{"Drama"}),
    TRUEDETECTIVE("oZkToJgabOA", "True Detective", new String[]{"Krimi", "Drama", "Thriller"}),
    STRANGERTHINGS("jJU_1ZSi-To", "Stranger Things", new String[]{"Drama", "Fantasy", "Thriller"}),
    THEWALKINGDEAD("sfAc2U20uyg", "The Walking Dead", new String[]{"Drama", "Horror"}),
    BANDOFBROTHERS("kyDkHvi9yeI", "Band Of Brothers", new String[]{"Drama", "Krieg"}),
    DEXTER("YQeUmSD1c3g", "Dexter", new String[]{"Drama", "Thriller"}),
    VIKINGS("t9EV3DJPHow", "Vikings", new String[]{"Abenteuer", "Drama", "Historie"}),
    DASDAMENGAMBIT("gijHVZ5YW4g", "Das Damengambit", new String[]{"Drama"}),
    WEDNESDAY("3i6eGvEA5JA", "Wednesday", new String[]{"Komödie", "Fantasy", "Thriller"}),
    HOWIMETYOURMOTHER("cjJLEYMzpjc", "How I Met Your Mother", new String[]{"Komödie"}),
    BROOKLYNNINENINE("sEOuJ4z5aTc", "Brooklyn-Nine-Nine", new String[]{"Komödie", "Krimi"}),
    NARCOS("4kpIwP_ruWw", "Narcos", new String[]{"Biopic", "Krimi", "Drama", "Thriller"});

    private final String[] genres;
    private String videoId;
    private String videoTitle;

    Videos(String videoId, String videoTitle, String[] genres){
        this.videoId = videoId;
        this.videoTitle = videoTitle;
        this.genres = genres;
    }

    private static final List<Videos> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Videos randomLetter()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    public String getVideoId() {
        return videoId;
    }

    public String getVideoTitle() {
        return videoTitle;
    }
}
