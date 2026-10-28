package com.musambokazi.users;

import java.time.LocalDate;

public class Driver extends User {
    private int idNumber;
    private LocalDate date;
    private String name;

    public Driver(int idNumber, LocalDate date, String name) {
        this.idNumber = idNumber;
        this.date = date;
        this.name = name;
    }


    @Override
    public void setIdNumber(int id) {
        this.idNumber = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public void setStatus() {
        status.DRIVER
    }
}