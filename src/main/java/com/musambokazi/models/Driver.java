package com.musambokazi.models;

public class Driver {
    private String name;
    private String location;
    private boolean active;

    public Driver(String name, String location) {
        this.name = name;
        this.location = location;
        this.active = false;
    }

    public String name(){
        return name;
    }

    public String location(){
        return location;
    }

    public void isActive(){
        active = true;
    }
}
