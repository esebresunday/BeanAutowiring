package com.Example5;

import com.example.ProjectConfig.ProjectConfig;
import com.examples.beans.Person1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Projet
{
    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person1 p = context.getBean(Person1.class);
        System.out.println(p.getName());
        p.getVehicle1().getVehicleServices().playMusic();
        p.getVehicle1().getVehicleServices().moveVehicle();
    }
}
