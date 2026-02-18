/*
 * ParkingLotSystem
 *
 * This program demonstrates the concept of an Array of Objects in Java.
 * A Car class is created, and multiple Car objects are stored inside
 * an array representing a parking lot.
 *
 * The program allows:
 * 1. Initializing a parking lot with some parked cars.
 * 2. Parking a new car in the first available (null) slot.
 * 3. Displaying the current status of the parking lot.
 *
 * This example illustrates:
 * - Object creation
 * - Constructors
 * - Arrays of objects
 * - Null checking
 * - Basic method usage in OOP
 */

class Car {
    String brand;

    // Constructor
    Car(String brand) {
        this.brand = brand;
    }

    // Override toString() for printing
    public String toString() {
        return brand;
    }
}

public class ParkingLotSystem {

    // Method to park a new car
    public static void parkCar(Car[] lot, Car newCar) {
        for (int i = 0; i < lot.length; i++) {
            if (lot[i] == null) {
                lot[i] = newCar;
                System.out.println("Car " + newCar.brand + 
                                   " parked successfully at slot " + i + ".");
                return;
            }
        }
        System.out.println("Parking Lot Full");
    }

    // Method to display current lot status
    public static void displayLot(Car[] lot) {
        System.out.print("Current Lot Status: [");
        for (int i = 0; i < lot.length; i++) {
            if (lot[i] != null) {
                System.out.print(lot[i]);
            } else {
                System.out.print("null");
            }

            if (i < lot.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        // Step 1: Initialize array with 2 cars and 2 nulls
        Car[] lot = new Car[4];
        lot[0] = new Car("Toyota");
        lot[1] = new Car("Honda");
        lot[2] = null;
        lot[3] = null;

        // Display initial lot
        displayLot(lot);

        // Step 2: New arrival
        Car newCar = new Car("Ford");

        // Park new car
        parkCar(lot, newCar);

        // Step 3: Display updated lot
        displayLot(lot);
    }
}
