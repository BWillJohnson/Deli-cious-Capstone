package com.pluralsight.DeliKiosk.Machine;

import com.pluralsight.FoodTruck.Sandwich;

import java.util.Scanner;

public class KioskOrderingUI {
    private Sandwich sandwich;

    private final Scanner myScan;
    public KioskOrderingUI(){ myScan = new Scanner(System.in); }

    public void display(){
         boolean logOut = false;
         while (!logOut){
             System.out.println("1. Place a Deli order. ");
             System.out.println("2. add a fountain drink. ");
             System.out.println("3. add a crunch to your order with our chips. ");
             System.out.println("4. Are you finish well lets checkOut! ");
             System.out.println("0. AWW you don't want to try our sandwich ok. bye-bye now.");

             System.out.println("Enter your option Here!");
             String option = myScan.nextLine();

             switch (option){
                 case "1" -> addSandwichRequest();
                 case "2" -> addDrinkRequest();
                 case "3" -> addChips();
                 case "4" -> deliCheckOut();
                 case "0" -> logOut = true;
                 default -> System.err.println("Notice! invalid option Try again 1-4");

             }
         }
    }
    public void addSandwichRequest(){
        System.out.println("--Customize your Deli-Cious Sandwich!");
        System.out.println("Enter your type of bread! {e.g [Wheat,White, Honey Wheat, Rye, Wrap]}");
        String breadType = myScan.nextLine();


    }
    public void addDrinkRequest(){

    }
    public void addChips(){

    }
    public void deliCheckOut(){


    }
}
