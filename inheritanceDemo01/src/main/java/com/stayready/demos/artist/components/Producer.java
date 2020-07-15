package com.stayready.demos.artist.components;

import com.stayready.demos.song.Song;
import com.stayready.demos.song.components.Beat;

public interface Producer {
    Song createABeat(Song song, Beat beat);
}
