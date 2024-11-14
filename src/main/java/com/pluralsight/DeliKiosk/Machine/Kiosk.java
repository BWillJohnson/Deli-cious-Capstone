package com.pluralsight.DeliKiosk.Machine;

import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        KioskOrderingUI Kiosk = new KioskOrderingUI();
        Scanner scanner= new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("------Welcome to DELICIOUS where you sandwich has the meat!------");
            System.out.println("1. Place a DElI-Cious order:\n");
            System.out.println("2. Exit without saying goodbye\n");

            System.out.println("Enter your option now!: ");
            String response = scanner.nextLine();

            switch (response){
                case "1"-> Kiosk.display();
                case "2"-> exit = true;

                default -> System.err.println("Notice! You are still here click[1]/[2]!");
            }

        }
    }
}
