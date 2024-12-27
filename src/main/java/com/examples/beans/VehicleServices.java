package com.examples.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices
{
    private String name = "Service";
    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public void playMusic()
    {
        String s = speakers.makeSound();
        System.out.println(s);
    }
    public void moveVehicle()
    {
        String s = tyres.rotate();
        System.out.println(s);
    }
    public String getName() {
        return name;
    }

    public void setNamen(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
