//package com.pluralsight.RecieptManager;
//
//import com.pluralsight.FoodTruck.Chips;
//import com.pluralsight.FoodTruck.Drink;
//import com.pluralsight.FoodTruck.Order;
//import com.pluralsight.FoodTruck.Sandwich;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public class ReceiptFileManager {
//
//
////    public void saveReceiptManager(){
////        LocalDateTime now = LocalDateTime.now();
////        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
////        String formattedDate = now.format(formatter);
////
////        StringBuilder receiptBuilder = new StringBuilder();
////        receiptBuilder.append("----DELI-Order-Receipt----\n");
////        receiptBuilder.append("Date: ").append(formattedDate).append("\n\n\n");
////
////    }
//
//    public class ReceiptFileManager {
//        public void saveReceipt(Order order) {
//            LocalDateTime time = LocalDateTime.now();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
//            String fileName = "Receipt" + time.format(formatter) + ".txt";
//            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
//                bw.write("********Dev-lious Subs********\n");
//                bw.write("1(800)Dev-lious\n");
//                bw.write("Manager Devin\n");
//                    if (Order instanceof Sandwich sandwich) {                    //casting merchandise to sandwich in order to have access
//                        bw.write("Sandwich:\n");
//                        bw.write("Size " + sandwich.getSandwichSize() + " inch ");
//                        bw.write(sandwich.getBreadType() + "Bread ");
//                        bw.write("is toasted " + sandwich.isToasted());
//                        bw.write(" with " + sandwich.addTopping().toString() + " on it");
//                        bw.write("Price: $" + String.format("%.2f", sandwich.calculatePrice()) + "\n\n");
//                    }
//                    if (order instanceof Chips chip) {
//                        bw.write(chip.getChipName() + " Chips" + "\n");
//                        bw.write("Price: $" + String.format("%.2f", chip.calculatePrice()) + "\n\n");
//                    }
//            }
//                bw.write("---------------------\n");
//                bw.write("Total Amount: $" + String.format("%.2f", .receiptPrice()) + "\n");
//                bw.write("---------------------\n");
//            } catch (IOException | IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//
//}
