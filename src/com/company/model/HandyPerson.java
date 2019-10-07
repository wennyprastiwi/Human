package com.company.model;

public class HandyPerson extends Human implements Electrician,Plumber{
    public HandyPerson(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String changeBulb() {
        return null;
    }

    @Override
    public String unplugDrain() {
        return null;
    }
}
