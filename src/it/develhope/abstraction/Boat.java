package it.develhope.abstraction;

public class Boat extends Vehicle {

    private double maxKnotsSpeed;
    private int boatKilosWeight;


    @Override
    public void doVehicleSound() {
        System.out.println("Vraaaaaaaaaaaaaaaaaam");
    }

    public Boat(double maxSpeed, int weight){
        this.type = "Boat";
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    public String getBoatWeightAndSpeed(){
        return "Total kilos of the boat: " + boatKilosWeight + " - Maximum knots speed: " + maxKnotsSpeed;
    }
}
