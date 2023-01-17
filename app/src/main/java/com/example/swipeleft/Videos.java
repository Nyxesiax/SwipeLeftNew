package com.example.swipeleft;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Videos {
    A("IdneKLhsWOQ", "Wildest Dreams"),
    B("vNoKguSdy4Y", "I knew you were trouble"),
    C("7F37r50VUTQ", "I Don’t Wanna Live Forever");
   /* D(""),
    E(""),
    F(""),
    G(""),
    H(""),
    I(""),
    J(""),
    K(""),
    L(""),
    M(""),
    N(""),
    O(""),
    P("");


    */

    private String videoId;
    private String videoTitle;

    Videos(String videoId, String videoTitle){
        this.videoId = videoId;
        this.videoTitle = videoTitle;
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
