package com.example.swipeleft;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Videos {
    A("IdneKLhsWOQ"),
    B(""),
    C(""),
    D(""),
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

    private String videoId;

    Videos(String videoId){
        this.videoId = videoId;
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
}
