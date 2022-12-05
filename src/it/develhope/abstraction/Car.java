package it.develhope.abstraction;

public class Car extends Vehicle{

    private int numberOfDoors;
    private double carPrice;

    @Override
    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("My car has " + numberOfDoors + " Doors");
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Bruuum bruuum");
    }

    public Car(int wheels, int doors, double price){
        this.type = "Car";
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
    }
}
