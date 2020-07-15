package com.stayready.demos.song;

import com.stayready.demos.song.components.Beat;
import com.stayready.demos.song.components.Hook;
import com.stayready.demos.song.components.Verse;

public class Song {

    private Beat beat;
    private Verse verse;
    private Hook hook;

    public Song(){
        this.beat = new Beat("");
        this.verse = new Verse("");
        this.hook = new Hook("");
    }

    public Song(Beat beat){
        this();
        this.beat = beat;
    }

    public Song(Hook hook){
        this();
        this.hook = hook;
    }

    public Song(Verse verse){
        this();
        this.verse = verse;
    }
    public Beat getBeat() {
        return beat;
    }

    public void setBeat(Beat beat) {
        this.beat = beat;
    }

    public Verse getVerse() {
        return verse;
    }

    public void setVerse(Verse verse) {
        this.verse = verse;
    }

    public Hook getHook() {
        return hook;
    }

    public void setHook(Hook hook) {
        this.hook = hook;
    }
}
