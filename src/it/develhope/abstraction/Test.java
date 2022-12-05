package it.develhope.abstraction;

public class Test {
    public static void main(String[] args) {

        Car car = new Car(4,4,15000.99);
        Boat boat = new Boat(100.50,200);

        car.showVehicleDetails();
        car.doVehicleSound();

        System.out.println("-------------------");

        boat.showVehicleDetails();
        boat.doVehicleSound();
        System.out.println(boat.getBoatWeightAndSpeed());
    }
}
