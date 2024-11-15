package com.pluralsight.DeliKiosk.Machine;

import com.pluralsight.FoodTruck.Chips;
import com.pluralsight.FoodTruck.Drink;
import com.pluralsight.FoodTruck.Order;
import com.pluralsight.FoodTruck.Sandwich;
import com.pluralsight.IncludedTopping.RegularTopping;
import com.pluralsight.IncludedTopping.Sauce;
import com.pluralsight.PremiumTopping.Cheese;
import com.pluralsight.PremiumTopping.Meat;
import java.util.Scanner;

public class KioskOrderUI {

    public static Order currentOrder = new Order();
    private final Scanner myScan;

    public KioskOrderUI() {
        myScan = new Scanner(System.in);
    }

    public void display() {
        currentOrder = new Order();
        boolean cancelOrder = false;
        while (!cancelOrder) {
            System.out.println("\nWelcome to Deli Kiosk!");
            System.out.println("1. Add a Sandwich");
            System.out.println("2. Add a Drink");
            System.out.println("3. Add a bag chips");
            System.out.println("4. Proceed to checkout");
            System.out.println("0. Cancel Order");
            System.out.print("Enter your option here: ");
            int response = myScan.nextInt();


            switch (response) {
                case 1:
                    addSandwichRequest(currentOrder);
                    break;
                case 2:
                   // addDrinkRequest();
                    break;
                case 3:
                    addChips(currentOrder);
                    break;
                case 4:
                    deliCheckOut(currentOrder);
                    cancelOrder = true;
                    break;
                case 0:
                    cancelOrder = true;
                    System.out.println("Order has been canceled!");
                    break;
                default:
                    System.err.println("Invalid option! Please try again (0-4).");
            }
        }
    }

    public void addSandwichRequest(Order currentOrder) {
        myScan.nextLine();

        System.out.println("Enter your type of bread! {e.g [Wheat,White, Honey Wheat, Rye, Wrap]}");
        String breadType = myScan.nextLine();

        System.out.println("Enter you sandwich Size(4\",8\",12\"): ");
        String sandwichSize = myScan.nextLine();

        System.out.println("Would you like your bread to be Toasted? (Yes or NO)");
        String toastOption = myScan.nextLine().toLowerCase().trim();
        boolean isToasted = toastOption.equals("yes");
        myScan.nextLine();
        System.out.println("Sandwich has been toasted!");

        Sandwich customersSandwich = new Sandwich(breadType, sandwichSize, isToasted);
        currentOrder.addSandwich(customersSandwich);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n Choose an option: ");
            System.out.println("0. add regular topping");
            System.out.println("1. add a premium topping");
            System.out.println("2. add a sauce");
            System.out.println("3. Hi are you done finalizing your Order!");
            System.out.println("4. Exit");
            System.out.println("Please enter your option (0-3) Thank you!: ");
            int option = myScan.nextInt();

            switch (option) {
                case 0 -> addRegularTopping(customersSandwich);
                case 1 -> addPremiumTopping(customersSandwich);
                case 2 -> addSauce(customersSandwich);
                case 3 -> {
                    System.out.println("\nFinalizing your order. . . . .");
                    System.out.println("The Total price: " + currentOrder.calculatePrice());
                    exit = true;
                }
                case 4 -> exit = true;
                default -> System.err.println("Notice Invalid option! Please enter a corresponding number!");
            }
        }
    }

    public void addRegularTopping(Sandwich sandwich) {
        boolean done = false;
        while (!done) {
            System.out.println("\nEnter regular topping name");
            System.out.println("1. Lettuce");
            System.out.println("2. Tomato");
            System.out.println("3. Pickles");
            System.out.println("4. Onions");
            System.out.println("5. Mushrooms");
            System.out.println("6. Exit");
            int choice = myScan.nextInt();

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

    public void addPremiumTopping(Sandwich sandwich) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nWould you like to add a meat or cheese topping?");
            System.out.println("1. Add a Meat topping");
            System.out.println("2. Add a Cheese topping");
            System.out.println("0. Exit premium toppings");

            int choice = myScan.nextInt();

            switch (choice) {
                case 1 -> addMeatTopping(sandwich);
                case 2 -> addCheeseTopping(sandwich);
                case 0 -> exit = true;
                default -> System.err.println("Invalid choice! Please choose 1, 2, or 0 to exit.");
            }
        }
    }
    public void addMeatTopping(Sandwich sandwich){
        boolean exit = false;
        while (!exit){
            System.out.println("\nPick a premium meat topping!");
            System.out.println("1. Steak");
            System.out.println("2. Isley ChippedHam");
            System.out.println("3. Salami");
            System.out.println("4. Chicken");
            System.out.println("0. Exit MeatToppings");

            int choiceOfMeat = myScan.nextInt();

            switch (choiceOfMeat) {
                case 1 -> {
                    sandwich.addTopping(new Meat("Steak"));
                    System.out.println("Steak has been added to your sandwich!");
                }
                case 2 -> {
                    sandwich.addTopping(new Meat("Isley ChippedHam"));
                    System.out.println("Isley ChippedHam has been added to your sandwich");
                }
                case 3 -> {
                    sandwich.addTopping(new Meat("Salami"));
                    System.out.println("Salami has been added to your sandwich");
                }
                case 4 -> {
                    sandwich.addTopping(new Meat("Chicken"));
                    System.out.println("Chicken has been added to your sandwich");
                }
                case 0 -> exit = true;
                default -> System.err.println("Notice invalid meat choice! 1-4 or 0 to exit.");
            }
        }
    }
    public void addCheeseTopping(Sandwich sandwich){
        boolean exit = false;
        while (!exit){
            System.out.println("\nPick a premium cheese topping!");
            System.out.println("1. American Cheese");
            System.out.println("2. ColbyJack");
            System.out.println("3. Swiss Cheese");
            System.out.println("0. Exit CheeseToppings");

            int choiceOfCheese = myScan.nextInt();

            switch (choiceOfCheese) {
                case 1 -> {
                    sandwich.addTopping(new Cheese("American Cheese"));
                    System.out.println("American Cheese has been added to your sandwich!");
                }
                case 2 -> {
                    sandwich.addTopping(new Cheese("ColbyJack"));
                    System.out.println("ColbyJack has been added to your sandwich");
                }
                case 3 -> {
                    sandwich.addTopping(new Cheese("Swiss Cheese"));
                    System.out.println("Swiss Cheese has been added to your sandwich");
                }
                case 0 -> exit = true;
                default -> System.err.println("Notice invalid Cheese choice! 1-4 or 0 to exit.");
            }
        }
    }

    public void addSauce(Sandwich sandwich) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose a sauce: ");
            System.out.println("1. Mayo");
            System.out.println("2. Mustard");
            System.out.println("3. Ketchup");
            System.out.println("4. SpicyMustard");
            System.out.println("5. BBQ");
            System.out.println("0. Exit sauces");

            int response = myScan.nextInt();

            switch (response) {
                case 1 -> {
                    sandwich.addSauce(new Sauce("Mayo"));
                    System.out.println("Mayo added!");
                }
                case 2 -> {
                    sandwich.addSauce(new Sauce("Mustard"));
                    System.out.println("Mustard added!");
                }
                case 3 -> {
                    sandwich.addSauce(new Sauce("Ketchup"));
                    System.out.println("Ketchup added!");
                }
                case 4 -> {
                    sandwich.addSauce(new Sauce("Spicy Mustard"));
                    System.out.println("Spicy Mustard added!");
                }
                case 5 -> {
                    sandwich.addSauce(new Sauce("BBQ"));
                    System.out.println("BBQ added!");
                }
                case 0 -> {
                    exit = true;
                    System.out.println("Exiting sauces menu.");
                }
                default -> System.err.println("Notice! Invalid choice 1-5 or 0 for exit please.");
            }
        }

    }

    public void addDrinkRequest(Drink drink) {
        boolean leave = false;
        while (!leave) {
            System.out.println("1. Coke");
            System.out.println("2. Sprite");
            System.out.println("3. Water");
            System.out.println("x. Exit");
            System.out.println("Please choose a drink 1-3 or 0 to exit");

           int choice = myScan.nextInt();

            switch (choice) {
                case 1 -> {
                    drink.addDrink(new Drink("Coke"));
                    System.out.println("You chose Coke!");
                }
                case 2 -> {
                    drink.addDrink(new Drink("Sprite"));
                    System.out.println("You chose Sprite!");
                }
                case 3 -> {
                    drink.addDrink(new Drink("Water"));
                    System.out.println("You chose Water!");
                }
                case 0 -> {
                    leave = true;
                    System.out.println("Exiting...");
                }
                default -> System.err.println("Invalid choice! only pick 1-3 or exit with 0.");
            }
        }

    }


    public void addChips(Order chips) {
        boolean found = false;
        while (!found) {
            System.out.println("\nTake a look at our chip selection!");
            System.out.println("1. Lays Potato Chips");
            System.out.println("2. Salt&Vinegar Chips");
            System.out.println("3. Pork-rinds");
            System.out.println("4, HotFries");
            System.out.println("5. Popcorn");
            System.out.println("0. Exiting.....");
            int customerChoice = myScan.nextInt();

            switch (customerChoice) {
                case 1 -> {

                    System.out.println("You chose Lays Potato Chips!");
                }
                case 2 -> {
                    //
                    System.out.println("You chose Salt&Vinegar Chips!");
                }
                case 3 -> {
                   //
                    System.out.println("You chose Pork-rinds");
                }
                case 4 -> {
                   //
                    System.out.println("You chose HotFries");
                }
                case 5 -> {
                    //
                    System.out.println("You chose Popcorn");
                }
                case 6 -> {
                    found = true;
                    System.out.println("Heading back to option menu");
                }
                default -> System.err.println("Invalid option! choose 1-5 or if you want to exit 0");
            }
        }

    }

    public void deliCheckOut(Order currentOrder) {
        System.out.println("\n--- Order Summary ---");
        if (!currentOrder.getSandwiches().isEmpty()){
            Sandwich sandwich = currentOrder.getSandwiches().get(0);
            System.out.println("Sandwich: " + sandwich + "Price: $" + sandwich.calculatePrice());
        }
        if (!currentOrder.getDrinks().isEmpty()){
            Drink drink = currentOrder.getDrinks().get(0);
            System.out.println("Drink: " + drink + "Price: $" + drink.calculatePrice());
        }
        if (!currentOrder.getChips().isEmpty()){
            Chips chips = currentOrder.getChips().get(0);
            System.out.println(chips + " :Bag Price: $" + chips.calculatePrice());
        }
        double priceDue = currentOrder.calculatePrice();
        System.out.println("Total: $" + priceDue);
        System.out.println("Thank you for coming to our foodTruck!!");


    }
}
