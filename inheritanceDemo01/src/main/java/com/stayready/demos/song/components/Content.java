package com.stayready.demos.song.components;

public abstract class Content {
    private String content;

    public Content(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString(){
        return content;
    }
}
