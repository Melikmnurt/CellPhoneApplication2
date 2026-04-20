package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Create two cell phone objects
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        //Input for first phone
        System.out.print("What is the serial number? ");
        int serial = input.nextInt();
        input.nextLine();

        System.out.print("What model is the phone?");
        String model = input.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = input.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = input.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = input.nextLine();

        //Store values using setters
        cellPhone1.setSerialNumber(serial);
        cellPhone1.setModel(model);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setPhoneNumber(phoneNumber);
        cellPhone1.setOwner(owner);

        //Input for second phone
        System.out.println("\nEnter information for Phone 2: ");

        System.out.print("What is the serial number? ");
        int serial2 = input.nextInt();
        input.nextLine();

        System.out.print("What model is the phone? ");
        String model2 = input.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier2 = input.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber2 = input.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner2 = input.nextLine();

        //Use setters to store values in the object
        cellPhone2.setSerialNumber(serial2);
        cellPhone2.setModel(model2);
        cellPhone2.setCarrier(carrier2);
        cellPhone2.setPhoneNumber(phoneNumber2);
        cellPhone2.setOwner(owner2);

        //Display both names
        display(cellPhone1);
        display(cellPhone2);

        //Phones call each other
        cellPhone1.dial(cellPhone2.getPhoneNumber()); //Phone 1 calls Phone 2
        cellPhone2.dial(cellPhone1.getPhoneNumber()); //Phone 2 calls Phone 1

        //Close scanner
        input.close();
    }
    //Static method to display phone details
    public static void display(CellPhone phone){

        //Print using getters
        System.out.println("\nCell Phone Information: ");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
