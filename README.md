# Exercise: 1-abstraction-override
* define an abstract class called `Vehicle` that has:
  * a string attribute `type`
  * an int attribute `numberOfWheels`
  * a method `showVehicleDetails()` that prints in console an informative message about the `type` and the `numberOfWheels`
  * an `abstract` method `doVehicleSound()`
* define a subclass `Car` of `Vehicle` that has:
  * an int attribute `numberOfDoors`
  * a double attribute `carPrice`
  * an override of the superclass method `showVehicleDetails()` that:
    * recalls the `super` method `showVehicleDetails()`
    * prints in console an informative message about the car's `numberOfDoors`
  * a mandatory override of the abstract method `doVehicleSound()` where you print the car's sound
  * a constructor method that:
    * accepts 3 params (`wheels`, `doors`, `price`)
    * assign the correct values to `type`, `numberOfWheels`, `numberOfDoors` and `carPrice`
* define a subclass `Boat` of `Vehicle` that has:
  * a double attribute `maxKnotsSpeed`
  * an int attribute `boatKilosWeight`
  * a mandatory override of the abstract method `doVehicleSound()` where you print the boat's sound
  * a constructor method that:
    * accepts 2 params (`maxSpeed`, `weight`)
    * assign the correct values to `type`, `maxKnotsSpeed` and `boatKilosWeight`
  * a method `getBoatWeightAndSpeed` that returns an informative `String` about the total kilos weight and the maximum knots speed
* define a tester class where you:
  * create a `Car` object and a `Boat` object
  * invoke the two `Vehicle` methods for the newly created `Car` and `Boat` objects
  * print in console the `Boat` weight and speed using the dedicated method
