package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }
    public List<Vehicle> getVehiclesByPrice(double min, double max){
//        Double min = null;
//        Double max = null;
//        System.out.println("Enter minimum price (Enter to skip):");
//        String minInput = scanner.nextLine();
//        System.out.println("Enter a maximum price (Enter to skip):");
//        String maxInput = scanner.nextLine();
//        if (!minInput.isBlank()){
//            try{
//                min = Double.parseDouble(minInput);
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input! Please enter a number.");
//            }
//        }
//        if (!maxInput.isBlank()){
//            try{
//                max = Double.parseDouble(maxInput);
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input! Please enter a number.");
//            }
//            for (Vehicle vehicle : this.dealership.getAllVehicles()){
//                if (vehicle.getPrice() > min && vehicle.getPrice() < max){
//
//                }
//            }
//        }
//
        return null;
    }
    public List<Vehicle> getVehiclesByMakeMadel(String make, String model){
        return null;
    }
    public List<Vehicle> getVehiclesByYear(int min, int max){
        return null;
    }
    public List<Vehicle> getVehiclesByColor(String color){
        return null;
    }
    public List<Vehicle> getVehiclesByMileage(int min, int max){
        return null;
    }
    public List<Vehicle> getVehicleByType(String vehicleType){
        return null;
    }
    public List<Vehicle> getAllVehicles(){
        return null;
    }
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
