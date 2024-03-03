package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    private int likes;

    public Artist(){

    }

    public Artist(String name){
        this.name = name;
        this.likes = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
//class AddArtist{
//    private List<Artist> artistList;
//
//    public AddArtist(){
//        this.artistList = new ArrayList<>();
//    }
//
//    public void newArtist(String name){
//        Artist artist = new Artist(name);
//        artistList.add(artist);
//    }
//}