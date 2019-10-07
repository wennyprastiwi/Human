package com.company.model;

public class IndustrialPlumber extends Human implements Plumber {
    public IndustrialPlumber(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String unplugDrain() {
        return null;
    }
}
