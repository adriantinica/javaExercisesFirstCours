/**
 * Write an app that lets users order drinks online;
 * 1. Outputs the name and price of the drink;
 * 2. Ask user for quantity;
 * 3. after the quantity is imputed, calculates the total cost ;
 * 4. Calculates delivery price like this: 
 *                        if the order contains 5+ drinks-- delivery is free....
*/
import java.util.Scanner;


public class FirstTernaryRestaurantApp {
    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);

       System.out.println();
       System.out.println("[ Hy, here you can buy Fanta drink (32 lei/bottle) ]");
       System.out.println();

       // INPUT DATA
        System.err.print("Enter bottles quantity: ");
       int productQuantity = in.nextInt();
       int fantaBottleCost = 32;
       int totalCost ;
       int deliveryPrice  = 50;
       int freeDelivery = 0;
      
       // Logic-- <<<<<  if else example >>>>>>>>>
        
        // totalCost = productQuantity * fantaBottleCost;
        // System.out.println("Total payment: "+ totalCost + " Lei");
        // System.out.println();

        // if (productQuantity >= 5){
        //     System.out.println("Your order will be delivered for free !!!");
        // } else 
        // {System.out.println(" Delivery will cost " + deliveryPrice + " Lei");
        // }
        // System.out.println();

        
        
        //  <<<<<<< ternary example >>>>>>>>>>>>>>>
        
        totalCost = productQuantity * fantaBottleCost;
        System.out.println("Total payment: "+ totalCost + " Lei");
        System.out.println();
        
        System.out.print("Your delivery will cost: ");
        productQuantity = productQuantity >= 5 ? freeDelivery  : deliveryPrice  ;
        System.out.print(productQuantity + " Lei");

    }
}