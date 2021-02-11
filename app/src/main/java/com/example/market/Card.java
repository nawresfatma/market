package com.example.market;

public class Card {
    private String title;
    private String imagepath;

    public Card(String title, String imagepath) {
        this.title = title;
        this.imagepath = imagepath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }
}
