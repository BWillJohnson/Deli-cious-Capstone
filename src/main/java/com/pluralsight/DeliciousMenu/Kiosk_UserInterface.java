package com.pluralsight.DeliciousMenu;

import Kitchen.Sandwich;

import java.util.Scanner;

public class Kiosk_UserInterface {
    private Sandwich sandwich;

    private final Scanner myScan;
    public Kiosk_UserInterface(){ myScan = new Scanner(System.in); }

    public void display(){
         boolean logOut = false;
         while (!logOut){
             System.out.println();
         }
    }
}
