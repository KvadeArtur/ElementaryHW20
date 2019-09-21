package com.kvart;

public class Album {

    private int userId;
    private int id;
    private String title;

    @Override
    public String toString() {
        return "Album{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
