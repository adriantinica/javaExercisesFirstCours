import java.util.Scanner;
public class FoodOrderApp {

    public static void main(String[] args) {

        // INPUT DATA
        
        System.out.println("FOOD ORDER");
        System.out.println("We are selling Pizza for 100 LEI a piece");

        System.out.print(" Enter quantity: ");
        Scanner in = new Scanner (System.in); 
        int pizzaQuantity = in.nextInt();

        System.out.println("You have chosed: " + pizzaQuantity + " pieces");

        // LOGIC
        
        System.out.println("Total Bill: " + pizzaQuantity*100 + " Lei" );

        // if demand is bigger then 5 pieces then, delivery is free 

        if ( pizzaQuantity >= 5 ){
        System.out.println("Delivery is free");
        }


    }
}