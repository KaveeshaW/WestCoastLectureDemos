package com.stayready.demos.artist;

import com.stayready.demos.artist.components.Producer;
import com.stayready.demos.artist.components.Rapper;
import com.stayready.demos.song.Song;
import com.stayready.demos.song.components.Beat;
import com.stayready.demos.song.components.Verse;

public class DrDre extends Artist implements Producer , Rapper {
    public DrDre() {
        super("Andre Romelle Young", "Dr Dre", 55);
    }

    @Override
    public Song createABeat(Song song, Beat beat) {
        song.setBeat(beat);
        return song;
    }

    @Override
    public Song addRapVerse(Song song, Verse verse) {
        // ask someone to write verse
        return null;
    }

    @Override
    public String signAutoGraph() {
        return "Still Dre";
    }
}
