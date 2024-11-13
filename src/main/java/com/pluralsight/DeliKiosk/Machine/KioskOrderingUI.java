package com.pluralsight.DeliKiosk.Machine;

import com.pluralsight.FoodTruck.Sandwich;
import com.pluralsight.IncludedTopping.Sauce;
import com.pluralsight.PremiumTopping.Meat;

import java.util.Scanner;

public class KioskOrderingUI {
    public static Sandwich sandwich;

    private static Scanner myScan;
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

        System.out.println("Enter your type of bread! {e.g [Wheat,White, Honey Wheat, Rye, Wrap]}");
        String breadType = myScan.nextLine();

        System.out.println("Enter you sandwich Size(4\",8\",12\"): ");
        String sandwichSize = myScan.nextLine();

        System.out.println("Would you like your bread to be Toasted? (Yes or NO)");
        String toastOption = myScan.nextLine().toLowerCase().trim();
        boolean isToasted = toastOption.equals("yes");

        Sandwich customersOrder = new Sandwich(breadType,sandwichSize,isToasted);

        boolean pickYourTaste = true;
        while (pickYourTaste){
            System.out.println("\n Choose an option: ");
            System.out.println("0. add regular topping");
            System.out.println("1. add a premium topping");
            System.out.println("2. add a sauce");
            System.out.println("3. Hi are you done finalizing your Order!");
            System.out.println("Please enter your option (0-3) Thank you!: ");
            int option = Integer.parseInt(myScan.nextLine());

            switch (option){
                case 0:
                    addRegularTopping(sandwich);
                    break;
                case 1:
                    addPremiumTopping(sandwich);
                    break;
                case 2:
                   // addSauce(sandwich);
                    break;
                case 3:
                    System.out.println("\nFinalizing your order. . . . .");
                    System.out.println(sandwich.calculatePrice());
                    pickYourTaste = false;
                default:
                    System.err.println("Notice Invalid option! Please enter a corresponding number!");
                    break;
            }
        }

    }
    public String addRegularTopping(Sandwich sandwich){

            System.out.println("\nEnter regular topping name");
            System.out.println("1. Lettuce");
            System.out.println("2. Tomato");
            System.out.println("3. Pickles");
            System.out.println("4. Onions");
            System.out.println("5. Mushrooms");
            int choice = Integer.parseInt(myScan.nextLine());
            String topping = "";
        switch (choice) {
            case 1 -> {
                return "Lettuce";
            }
            case 2 -> {
                return "Tomato";
            }
            case 3 -> {
                return "Pickles";
            }
            case 4 -> {
                return "Onions";
            }
            case 5 -> {
                return "Mushrooms";
            }
            default -> System.err.println("Notice Invalid response");
        }
        return topping;
    }
    public String addPremiumTopping(Sandwich sandwich){
        System.out.println("\n Enter a premium topping (e.g type meat)");
        System.out.println("1. Steak");
        System.out.println("2. Ham");
        System.out.println("3. Salami");
        System.out.println("4. Chicken");
        System.out.println("X. Exit premiumTopping");

        int option = Integer.parseInt(myScan.nextLine());

        switch (option){
            case 1 ->
            {
                return  "Steak";
            }
            case 2 -> {
                return  "Ham";
            }
            case 3 -> {
                return  "Salami";
            }
            case 4 -> {
                return  "Chicken";
            }
            default -> System.err.println("Notice Premium meat not selected ");
        }
        
    }
    public void addDrinkRequest(){

    }
    public void addChips(){

    }
    public void deliCheckOut(){


    }
}
