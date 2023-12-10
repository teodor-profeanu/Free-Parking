package com.example.polihi;

public class ListItem {
    private int imageResourceId; // Resource ID for the image
    private String title;
    private String description;

    private String money;

    // Constructor and getters
    public ListItem(int imageResourceId, String title, String description, String money) {
        this.imageResourceId = imageResourceId;
        this.title = title;
        this.description = description;
        this.money = money;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getMoney() {
        return money;
    }
}