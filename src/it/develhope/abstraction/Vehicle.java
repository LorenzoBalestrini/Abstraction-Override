package it.develhope.abstraction;

public abstract class Vehicle {
    public String type;
    public int numberOfWheels;

    public void showVehicleDetails(){
        System.out.println("My vehicle is a " + type + " and it has " + numberOfWheels + " wheels");
    }

    public abstract void doVehicleSound();
}
