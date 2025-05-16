package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    Scanner scanner = new Scanner(System.in);

    private Dealership init(){
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        return this.dealership = dealershipFileManager.getDealership();
    }


    public UserInterface(){

    }
    public void display(){
        init();

        boolean exit = false;
        while (!exit) {
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
            }
        }


    }
    public void processGetByPriceRequest() {
    }
    public void processGetByMakeModelRequest(){

    }
    public void processGetByColorRequest(){

    }
    public void processGetByYearRequest(){

    }
    public void  processGetByMileageRequest(){

    }
    public void processGetByVehicleTypeRequest(){

    }
    public void  processGetAllVehiclesRequest(){

    }
    public void processAddVehicleRequest(){

    }
    public void processRemoveVehicleRequest(){

    }
}
