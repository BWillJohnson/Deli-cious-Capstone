package com.pluralsight.DeliKiosk.Machine;

import com.pluralsight.FoodTruck.Chips;
import com.pluralsight.FoodTruck.Drink;
import com.pluralsight.FoodTruck.Sandwich;
import com.pluralsight.IncludedTopping.RegularTopping;
import com.pluralsight.IncludedTopping.Sauce;
import com.pluralsight.PremiumTopping.Cheese;
import com.pluralsight.PremiumTopping.Meat;
import com.pluralsight.PremiumTopping.PremiumTopping;


import java.util.Scanner;

public class KioskOrderingUI {
    private Sandwich sandwich;
    private Drink drink;
    private Chips chips;
    private PremiumTopping premiumTopping;

    private final Scanner myScan;

    public KioskOrderingUI() {
        myScan = new Scanner(System.in);
    }

    public void display() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nWelcome to Deli Kiosk!");
            System.out.println("1. Place a Deli order");
            System.out.println("2. Add a fountain drink");
            System.out.println("3. Add chips to your order");
            System.out.println("4. Proceed to checkout");
            System.out.println("0. Exit");
            System.out.print("Enter your option here: ");
            String response = myScan.nextLine();


            switch (response) {
                case "1":
                    addSandwichRequest();
                    break;
                case "2":
                    addDrinkRequest();
                    break;
                case "3":
                    addChips();
                    break;
                case "4":
                    deliCheckOut();
                    break;
                case "0":
                    exit = true;
                default:
                    System.err.println("Invalid option! Please try again (0-4).");
            }
        }
    }

    public void addSandwichRequest() {

        System.out.println("Enter your type of bread! {e.g [Wheat,White, Honey Wheat, Rye, Wrap]}");
        String breadType = myScan.nextLine();

        System.out.println("Enter you sandwich Size(4\",8\",12\"): ");
        String sandwichSize = myScan.nextLine();

        System.out.println("Would you like your bread to be Toasted? (Yes or NO)");
        String toastOption = myScan.nextLine().toLowerCase().trim();
        boolean isToasted = toastOption.equals("yes");

        Sandwich customersOrder = new Sandwich(breadType, sandwichSize, isToasted);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n Choose an option: ");
            System.out.println("0. add regular topping");
            System.out.println("1. add a premium topping");
            System.out.println("2. add a sauce");
            System.out.println("3. Hi are you done finalizing your Order!");
            System.out.println("4. Exit");
            System.out.println("Please enter your option (0-3) Thank you!: ");
            int option;
            try {
                option = Integer.parseInt(myScan.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Invalid input enter 0-4");
                continue;
            }

            switch (option) {
                case 0:
                    addRegularTopping();
                    break;
                case 1:
                    addPremiumTopping();
                    break;
                case 2:
                    addSauce();
                    break;
                case 3:
                    System.out.println("\nFinalizing your order. . . . .");
                    System.out.println(sandwich.calculatePrice());
                    exit = true;
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.err.println("Notice Invalid option! Please enter a corresponding number!");
                    break;
            }
        }

    }

    public void addRegularTopping() {
        boolean done = true;
        while (!done) {
            System.out.println("\nEnter regular topping name");
            System.out.println("1. Lettuce");
            System.out.println("2. Tomato");
            System.out.println("3. Pickles");
            System.out.println("4. Onions");
            System.out.println("5. Mushrooms");
            System.out.println("6. Exit");
            int choice = Integer.parseInt(myScan.nextLine());

            switch (choice) {
                case 1 -> {
                    sandwich.addTopping(new RegularTopping("Lettuce"));
                    System.out.println("Lettuce has now been added to your sandwich!");
                }
                case 2 -> {
                    sandwich.addTopping(new RegularTopping("Tomato"));
                    System.out.println("Tomato has now been added to your sandwich!");
                }
                case 3 -> {
                    sandwich.addTopping(new RegularTopping("Pickles"));
                    System.out.println("Pickles has now been added to your sandwich!");
                }
                case 4 -> {
                    sandwich.addTopping(new RegularTopping("Onions"));
                    System.out.println("Onions has now been added to your sandwich!");
                }
                case 5 -> {
                    sandwich.addTopping(new RegularTopping("Mushrooms"));
                    System.out.println("Mushrooms has now been added to your sandwich!");
                }
                case 6 -> {
                    done = true;
                }
                default -> System.err.println("Notice Invalid response");
            }

        }
    }

    public void addPremiumTopping() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\n Enter a premium topping (e.g type meat/ cheese)");
            System.out.println("1. Steak");
            System.out.println("2. Ham");
            System.out.println("3. Salami");
            System.out.println("4. Chicken");
            System.out.println("5. American cheese");
            System.out.println("6. Colby jack");
            System.out.println("7. Swiss");
            System.out.println("x. Exit premiumTopping");

            String option = myScan.nextLine();

            switch (option) {
                case "1" -> sandwich.addTopping(new Meat("Steak"));
                case "2" -> sandwich.addTopping(new Meat("Ham"));
                case "3" -> sandwich.addTopping(new Meat("Salami"));
                case "4" -> sandwich.addTopping(new Meat("Chicken"));
                case "5" -> sandwich.addTopping(new Cheese("American cheese"));
                case "6" -> sandwich.addTopping(new Cheese("Colby jack"));
                case "7" -> sandwich.addTopping(new Cheese("Swiss"));
                case "x" -> exit = true;
            }
            premiumTopping.getToppingName();

        }
    }

    public void addSauce() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose a sauce: ");
            System.out.println("1. Mayo");
            System.out.println("2. Mustard");
            System.out.println("3. Ketchup");
            System.out.println("4. SpicyMustard");
            System.out.println("5. BBQ");
            System.out.println("x. Exit sauces");

            String response = myScan.nextLine();

            switch (response) {
                case "1":
                    sandwich.addSauce(new Sauce("Mayo"));
                    System.out.println("Mayo added!");
                    break;
                case "2":
                    sandwich.addSauce(new Sauce("Mustard"));
                    System.out.println("Mustard added!");
                    break;
                case "3":
                    sandwich.addSauce(new Sauce("Ketchup"));
                    System.out.println("Ketchup added!");
                    break;
                case "4":
                    sandwich.addSauce(new Sauce("Spicy Mustard"));
                    System.out.println("Spicy Mustard added!");
                    break;
                case "5":
                    sandwich.addSauce(new Sauce("BBQ"));
                    System.out.println("BBQ added!");
                    break;
                case "x":
                    exit = true;
                    System.out.println("Exiting sauces menu.");
                    break;
                default:
                    System.err.println("Notice! Invalid choice 1-5 or X for exit please.");
            }
        }
    }

        public void addDrinkRequest () {
            boolean leave = false;
            while (!leave) {
                System.out.println("1. Coke");
                System.out.println("2. Sprite");
                System.out.println("3. Water");
                System.out.println("x. Exit");
                System.out.println("Please choose a drink 1-3 or x to exit");

                String choice = myScan.nextLine().trim().toLowerCase();

                switch (choice) {
                    case "1" -> {
                        drink.addDrink(new Drink("Coke"));
                        System.out.println("You chose Coke!");
                    }
                    case "2" -> { drink.addDrink(new Drink("Sprite"));
                        System.out.println("You chose Sprite!");
                    }
                    case "3" ->{ drink.addDrink(new Drink("Water"));
                        System.out.println("You chose Water!");
                    }
                    case "x" -> {
                        leave = true;
                        System.out.println("Exiting...");
                    }
                    default -> System.err.println("Invalid choice! only pick 1-3 or exit with x.");
                }
            }
        }



    public void addChips() {
        boolean found = false;
        while (!found) {
            System.out.println("\nTake a look at our chip selection!");
            System.out.println("1. Lays Potato Chips");
            System.out.println("2. Salt&Vinegar Chips");
            System.out.println("3. Pork-rinds");
            System.out.println("4, HotFries");
            System.out.println("5. Popcorn");
            System.out.println("0. Exiting.....");

            String customerChoice = myScan.nextLine().trim().toLowerCase();

            switch (customerChoice) {
                case "1":
                    System.out.println("You chose Lays Potato Chips!");
                    break;
                case "2":
                    System.out.println("You chose Salt&Vinegar Chips!");
                    break;
                case "3":
                    System.out.println("You chose Pork-rinds");
                    break;
                case "4":
                    System.out.println("You chose HotFries");
                    break;
                case "5":
                    System.out.println("You chose Popcorn");
                    break;
                case "0":
                    found = true;
                    System.out.println("Heading back to option menu");
                    break;
                default:
                    System.err.println("Invalid option! choose 1-5 or if you want to exit 0");
            }
            chips.getTypeOfChips();
        }

    }

    public void deliCheckOut() {
        System.out.println("\n--- Order Summary ---");

        System.out.println("Sandwich: " + sandwich);
        System.out.println("Total Price: " + sandwich.calculatePrice());

        if (drink != null) {
            System.out.println("Drink: " + drink.getDrinkName());
        }
        if (chips != null) {
            System.out.println("Chips: " + chips.getTypeOfChips());
        }

        // Calculate Total
        String total = sandwich.calculatePrice();
        System.out.println("Thank you for coming!");


    }
}
