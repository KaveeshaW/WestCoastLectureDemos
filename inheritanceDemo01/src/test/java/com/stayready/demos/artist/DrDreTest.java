package com.stayready.demos.artist;

import com.stayready.demos.song.Song;
import com.stayready.demos.song.components.Beat;
import org.junit.Assert;
import org.junit.Test;

public class DrDreTest {

    @Test
    public void createABeatTest(){
        DrDre drDre = new DrDre();
        Beat beat = new Beat("Still Dre");
        Song expectedSong = new Song(beat);
        Song actualSong = drDre.createABeat(new Song(), beat);
        Assert.assertTrue(expectedSong.getBeat().toString().equals(actualSong.getBeat().toString()));

    }
}
