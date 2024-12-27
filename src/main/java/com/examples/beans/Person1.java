package com.examples.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person1
{
    private String name = "Onaara";
    private Vehicle1 vehicle1;

    public Vehicle1 getVehicle1() {
        return vehicle1;
    }

    @Autowired
    public void setVehicle1(Vehicle1 vehicle1) {
        this.vehicle1 = vehicle1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
