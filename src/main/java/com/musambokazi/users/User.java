package com.musambokazi.users;

import java.time.LocalDate;

public abstract class User {
    protected int idNumber;
    protected LocalDate date;
    protected String name;

    enum status {CUSTOMER, DRIVER}



    public abstract void setIdNumber(int id);
    public abstract void setName(String name);
    public abstract void setDate(LocalDate date);
    public abstract void setStatus();
}
