package com.ums.sun.umsmedicapp;



public class MainOrgansModel {

    // Getter and Setter model for recycler view items
    private String title, location, name;
    private int image;

    public MainOrgansModel(String title, String location, String name, int image) {
        this.name = name;
        this.title = title;
        this.location = location;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
