package com.pluralsight.RecieptManager;

import com.pluralsight.FoodTruck.Order;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptFileManager {
    public void saveReceiptManager(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);

        StringBuilder receiptBuilder = new StringBuilder();
        receiptBuilder.append("----DELI-Order_Receipt----\n");
        receiptBuilder.append("Date: ").append(formattedDate).append("\n\n\n");
        
    }

}
