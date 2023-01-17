package com.example.swipeleft;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Videos {

    A("KPLWWIOCOOQ", "Game of Thrones", new String[]{"Drama", "Fantasy"}),
    B("lrcqbavlbyQ", "Breaking Bad", new String[]{"Drama"}),
    C("IrBKwzL3K7s", "Sherlock", new String[]{"Abenteuer", "Krimi", "Drama"}),
    D("V2ZxSJy_BOQ", "The Mandalorian", new String[]{"Abenteuer", "Sci-Fi"}),
    E("s9APLXM9Ei8", "Chernobyl", new String[]{"Drama"}),
    F("fVQUcaO4AvE", "True Detective", new String[]{"Krimi", "Drama", "Thriller"}),
    G("b9EkMc79ZSU", "Stranger Things", new String[]{"Drama", "Fantasy", "Thriller"}),
    H("sfAc2U20uyg", "The Walking Dead", new String[]{"Drama", "Horror"}),
    I("kyDkHvi9yeI", "Band Of Brothers", new String[]{"Drama", "Krieg"}),
    J("YQeUmSD1c3g", "Dexter", new String[]{"Drama", "Thriller"}),
    K("9GgxinPwAGc", "Vikings", new String[]{"Abenteuer", "Drama", "Historie"}),
    L("gijHVZ5YW4g", "Das Damengambit", new String[]{"Drama"}),
    M("Di310WS8zLk", "Wednesday", new String[]{"Komödie", "Fantasy", "Thriller"}),
    N("cjJLEYMzpjc", "How I Met Your Mother", new String[]{"Komödie"}),
    O("sEOuJ4z5aTc", "Brooklyn-Nine-Nine", new String[]{"Komödie", "Krimi"}),
    P("xl8zdCY-abw", "Narcos", new String[]{"Biopic", "Krimi", "Drama", "Thriller"});

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
