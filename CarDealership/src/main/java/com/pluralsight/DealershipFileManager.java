package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DealershipFileManager {
    public Dealership getDealership(){
        Dealership dealership = null;

       // new Dealership("","","");
        try{
            FileReader fileReader = new FileReader("inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;
            while ((input = bufferedReader.readLine()) != null){
                String[] parts = input.split("\\|");
                Vehicle vehicle = new Vehicle(0,0,"","","","",0,0);
                if (parts.length == 3){
                   dealership.setName(parts[0]);
                   dealership.setAddress(parts[1]);
                   dealership.setPhone(parts[2]);
                }
                else if (parts.length == 8){
                    vehicle.setVin(Integer.parseInt(parts[0]));
                    vehicle.setYear(Integer.parseInt(parts[1]));
                    vehicle.setMake(parts[2]);
                    vehicle.setModel(parts[3]);
                    vehicle.setVehicleType(parts[4]);
                    vehicle.setColor(parts[5]);
                    vehicle.setOdometer(Integer.parseInt(parts[6]));
                    vehicle.setPrice(Double.parseDouble(parts[7]));
                    dealership.addVehicle(vehicle);
                }
                else System.out.println("Issue reading Vehicle info from file.");
            }
            bufferedReader.close();
        }
        catch (IOException e){
            System.out.println("Error occurred reading file. Double check file name.");
            e.printStackTrace();
        }
        return dealership;
    }
    public void saveDealership(){

    }


}
