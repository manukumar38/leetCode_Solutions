package com.leetcode.solutions;

public class ParkingLotProblem {

    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot(10);
        Vehicle v1 = new Vehicle("KA05443", "car");
        parkingLot.park(v1);
        System.out.println("Available slots : "+parkingLot.availableSlots());
        parkingLot.remove(0);
        System.out.println("Available slots : "+parkingLot.availableSlots());

    }
}

class ParkingLot {

    private int capacity;
    private Vehicle[] vehicles;

    public ParkingLot(int capacity){
        this.capacity = capacity;
        this.vehicles = new Vehicle[capacity];
    }

    public boolean park (Vehicle vehicle) {
        for (int i = 0; i < capacity ; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = vehicle;
                return true;
            }
        }
        return false;
    }

    public void remove (int spot) {
        if (spot < 0 || spot >= capacity) {
            System.out.println("Invalid spot");
        } else {
            vehicles[spot] = null;
        }
    }

    public int availableSlots() {
        int count = 0;
        for (int i = 0; i < capacity; i++) {
            if(vehicles[i] == null) {
                count ++;
            }
        }
        return count;
    }

}

class Vehicle {

    private String regNum;
    private String type;

    public Vehicle(String regNum, String type) {
        this.regNum = regNum;
        this.type = type;
    }
}