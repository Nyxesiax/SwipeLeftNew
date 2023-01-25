package com.example.swipeleft;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Videos {

    GAMEOFTHRONES("dcFIvnj8_UI", "Game of Thrones", new String[]{"Drama", "Fantasy"}, "4.4", "2011"),
    BREAKINGBAD("ceqOTZnhgY8", "Breaking Bad", new String[]{"Drama"}, "4.7", "2008"),
    SHERLOCK("ofG0IIFe5rc", "Sherlock", new String[]{"Abenteuer", "Krimi", "Drama"}, "5.0", "2010"),
    THEMANDALORIAN("V2ZxSJy_BOQ", "The Mandalorian", new String[]{"Abenteuer", "Sci-Fi"}, "4.7", "2019"),
    CHERNOBYL("dsWF6vC8zpY", "Chernobyl", new String[]{"Drama"}, "4.9", "2019"),
    TRUEDETECTIVE("oZkToJgabOA", "True Detective", new String[]{"Krimi", "Drama", "Thriller"}, "4.4", "2014"),
    STRANGERTHINGS("jJU_1ZSi-To", "Stranger Things", new String[]{"Drama", "Fantasy", "Thriller"}, "4.7", "2016"),
    THEWALKINGDEAD("sfAc2U20uyg", "The Walking Dead", new String[]{"Drama", "Horror"}, "4.5", "2010"),
    BANDOFBROTHERS("kyDkHvi9yeI", "Band Of Brothers", new String[]{"Drama", "Krieg"}, "4.3", "2001"),
    DEXTER("YQeUmSD1c3g", "Dexter", new String[]{"Drama", "Thriller"}, "4.9", "2006"),
    VIKINGS("t9EV3DJPHow", "Vikings", new String[]{"Abenteuer", "Drama", "Historie"}, "4.6", "2013"),
    DASDAMENGAMBIT("gijHVZ5YW4g", "Das Damengambit", new String[]{"Drama"}, "4.9", "2020"),
    WEDNESDAY("3i6eGvEA5JA", "Wednesday", new String[]{"Komödie", "Fantasy", "Thriller"}, "4.8", "2022"),
    HOWIMETYOURMOTHER("cjJLEYMzpjc", "How I Met Your Mother", new String[]{"Komödie"}, "3.9", "2005"),
    BROOKLYNNINENINE("sEOuJ4z5aTc", "Brooklyn-Nine-Nine", new String[]{"Komödie", "Krimi"}, "4.8", "2013"),
    NARCOS("4kpIwP_ruWw", "Narcos", new String[]{"Biopic", "Krimi", "Drama", "Thriller"}, "4.2", "2015");

    private final String[] genres;
    private String videoId;
    private String videoTitle;
    private String bewertung;
    private String jahr;

    Videos(String videoId, String videoTitle, String[] genres, String bewertung, String jahr){
        this.videoId = videoId;
        this.videoTitle = videoTitle;
        this.genres = genres;
        this.bewertung = bewertung;
        this.jahr = jahr;
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

    public String[] getGenres(){return genres;}

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getBewertung() {
        return bewertung;
    }

    public void setBewertung(String bewertung) {
        this.bewertung = bewertung;
    }

    public String getJahr() {
        return jahr;
    }

    public void setJahr(String jahr) {
        this.jahr = jahr;
    }

}
