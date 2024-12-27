package com.examples.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle1
{
    private String name = "Audi";
    private VehicleServices vehicleServices;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public void setVehicleServices(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    @Autowired
    public Vehicle1(VehicleServices vehicleServices)
    {
        this.vehicleServices = vehicleServices;
    }
}
