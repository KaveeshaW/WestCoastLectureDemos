package com.stayready.demos.artist.components;

import com.stayready.demos.song.Song;

public interface Hook {
    Song addHookToSong(Song song , Hook hook);
}
