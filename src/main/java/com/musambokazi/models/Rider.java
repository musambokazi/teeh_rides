package com.musambokazi.models;

public class Rider {
    private String name;
    private  String location;
    private  String destination;

    public Rider(String name, String location, String destination) {
        this.name = name;
        this.location = location;
        this.destination = destination;
    }

    public String name() {
        return name;
    }

    public String location() {
        return location;
    }

    public String destination() {
        return destination;
    }
}
