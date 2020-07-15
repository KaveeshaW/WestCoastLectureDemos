package com.stayready.demos.artist;

import com.stayready.demos.artist.components.Hook;
import com.stayready.demos.artist.components.Producer;
import com.stayready.demos.artist.components.Rapper;
import com.stayready.demos.song.Song;
import com.stayready.demos.song.components.Beat;
import com.stayready.demos.song.components.Verse;

public class Kanye extends Artist implements Producer, Hook, Rapper {

    public Kanye() {
        super("Kanye West", "Yeezy", 43);
    }

    @Override
    public Song addHookToSong(Song song, Hook hook) {
        return null;
    }

    @Override
    public Song createABeat(Song song, Beat beat) {
        return null;
    }

    @Override
    public Song addRapVerse(Song song, Verse verse) {
        return null;
    }

    @Override
    public String signAutoGraph() {
        return "Vote Kanye 2020";
    }
}
