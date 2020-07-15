package com.stayready.demos.artist.components;

import com.stayready.demos.song.Song;
import com.stayready.demos.song.components.Verse;

public interface Rapper {
    Song addRapVerse(Song song, Verse verse);
}
