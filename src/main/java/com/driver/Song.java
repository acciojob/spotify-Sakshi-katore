package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Song {
    private String title;
    private int length;
    private int likes;

    public Song(){

    }

    public Song(String title, int length){
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}


//public class AddSong {
//    private List<Song> songList;
//    private List<Album> albumList;
//
//    public AddSong() {
//        songList = new ArrayList<>();
//        albumList = new ArrayList<>();
//    }
//
//    public void newSong(String title, Album album) throws Exception {
//        boolean albumExists = false;
//        for (Album a : albumList) {
//            if (a.getTitle().equals(album.getTitle())) {
//                albumExists = true;
//                break;
//            }
//        }
//        if (!albumExists) {
//            throw new Exception("Album '" + album.getTitle() + "' does not exist.");
//        }
//        songList.add(new Song(title, album.getTitle()));
//    }
//}
