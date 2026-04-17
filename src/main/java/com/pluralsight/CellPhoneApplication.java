package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Create a cellphone object
        CellPhone phone = new CellPhone();

        //Ask user for input
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

        //Use setters to store values in the object
        phone.setSerialNumber(serial);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

        //Print using getters
        System.out.println("\nCell Phone Information: ");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

        //Close scanner
        input.close();
    }
}
