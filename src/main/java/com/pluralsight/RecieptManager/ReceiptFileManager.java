package com.pluralsight.RecieptManager;

import com.pluralsight.FoodTruck.Chips;
import com.pluralsight.FoodTruck.Drink;
import com.pluralsight.FoodTruck.Order;
import com.pluralsight.FoodTruck.Sandwich;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptFileManager {


    public void saveReceiptManager(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);

        StringBuilder receiptBuilder = new StringBuilder();
        receiptBuilder.append("----DELI-Order-Receipt----\n");
        receiptBuilder.append("Date: ").append(formattedDate).append("\n\n\n");

    }

}
