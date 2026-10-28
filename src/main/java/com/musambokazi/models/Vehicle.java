package com.musambokazi.models;

public abstract class Vehicle {
    protected String id;
    protected String model;
    protected String make;
    protected String name;

    protected Vehicle(String id, String model, String make, String name){
        this.id = id;
    }
}
