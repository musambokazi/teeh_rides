package com.musambokazi.users;

import java.time.LocalDate;

public class Passenger extends User{
    private int id;
    private String name;
    private LocalDate date;


    public Passenger(int id, String name, LocalDate date){
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public String name(){
        return name;
    }

    @Override
    public void setIdNumber(int id) {
        this.idNumber = id;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public void setStatus() {
        status customer = status.CUSTOMER;
    }

    public int id(){
        return id;
    }

    public LocalDate date(){
        return date;
    }
}
