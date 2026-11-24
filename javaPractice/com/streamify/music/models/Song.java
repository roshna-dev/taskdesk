package com.streamify.music.models;

public class Song {
    private String title;
    private int playCount;
    public String genre ="Pop"; //package private

    public Song(String title,int playCount){
        this.title=title;
        this.playCount=playCount;
    }
    public void printSummary(){
        System.out.println("Song:" +title);
        System.out.println("Play Count:"+playCount);
    }
}
