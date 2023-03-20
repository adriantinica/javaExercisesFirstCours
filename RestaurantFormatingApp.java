/*
*  Watch the assignment: https://github.com/dorinesinenco/EDUQATION/blob/master/programming/java/control/RESTAURANT.if.else.ro.md
*/
import java.util.Scanner;
import java.util.Formatter;

public class RestaurantFormatingApp {

    public static void main(String[] args) {
        
        // DATA LAYER
        final String CURRENCY = "MDL";
        final int validChoise = 1;
        final int cancelChoise = 2;
        int deliveryCost = 50;

        
        final String FOOD_1_NAME = "\"Pizza\"";
        int food_1_available_quantity = 5; 
        final float FOOD_1_PRICE = 75.5f;
        
        final String FOOD_2_NAME = "\"Mamaliga\"";
        int food_2_available_quantity = 5;
        final float FOOD_2_PRICE = 150f;
        
        final String FOOD_3_NAME = "\"Salad\"";
        final float FOOD_3_PRICE = 30f;
        int food_3_available_quantity = 5;
        

        // PRESENTATION & LOGIC LAYER
        System.out.printf("\n********* MENU **********\n" +
                        "1. %-10s %7.2f %s\n" +
                        "2. %-10s %7.2f %s\n" +
                        "3. %-10s %7.2f %s\n" +
                        "*************************\n\n",
                FOOD_1_NAME, FOOD_1_PRICE, CURRENCY,
                FOOD_2_NAME, FOOD_2_PRICE, CURRENCY,
                FOOD_3_NAME, FOOD_3_PRICE, CURRENCY);
            

            
        Scanner in = new Scanner(System.in);
        System.out.print(" CHOOSE AN OPTION >>> ");
        int option = in.nextInt();


        // IF FIRST OPTION IS CHOSEN

        if (option == 1) {
            System.out.println("Your choise is: " + FOOD_1_NAME); 
            System.out.print("How many do you want: ");
            int quantity = in.nextInt();
            float totalCost = quantity *FOOD_1_PRICE;
            if (quantity <= food_1_available_quantity){
                System.out.println("Total: " + totalCost + CURRENCY );
                System.out.print("<<<For order confirmation press: \"1\" or press :\"2\" to cancel order>>> ");
                int orderconfirm = in.nextInt();
                if (orderconfirm == validChoise ){
                    System.out.println("Your order will be prepared immediately!");
                    System.out.print("To request delivery press 1; press 2 for take away:  ");
                    int deliveryconfirm = in.nextInt();
                    if ( deliveryconfirm == 1 ){
                        if ( totalCost < 200 ){
                        System.out.println("Due to your total Order delivery will cost: " + deliveryCost + CURRENCY);
                        }else{
                        System.out.printf("Due to your total Order delivery is free !!!" );
                        }
                    }else {                                                                         // if (deliveryconfirm == 2)
                        System.out.println("We are waiting for you in our restaurant!");
                    }
                } else if (orderconfirm == cancelChoise ) {
                    System.out.println("Your order is canceled! ");
                    System.out.println("---------------------------------");
                    System.out.println("Thank you for visiting our online restaurant!\n ");

                }


            }else {
                System.out.printf(" You've ordered to many %s at once \n " , FOOD_1_NAME);
                System.out.println(" Restart the page and make another order :) ");
            }
          
            // IF SECOND OPTION IS CHOSEN

        } else if (option == 2){
            System.out.println("Your choise is: " + FOOD_2_NAME);   
            System.out.print("How many do you want: ");
            int quantity = in.nextInt();
            float totalCost = quantity *FOOD_2_PRICE;
            if (quantity <= food_2_available_quantity){
                System.out.println("Total: " + totalCost + CURRENCY );
                System.out.print("<<<For order confirmation press: \"1\" or press :\"2\" to cancel order>>> ");
                int orderconfirm = in.nextInt();
                if (orderconfirm == validChoise ){
                    System.out.println("Your order will be prepared immediately!");
                    System.out.print("To request delivery press 1; press 2 for take away:  ");
                    int deliveryconfirm = in.nextInt();
                    if ( deliveryconfirm == 1 ){
                        if ( totalCost < 200 ){
                        System.out.println("Due to your total Order delivery will cost: " + deliveryCost + CURRENCY);
                        }else{
                        System.out.printf("Due to your total Order delivery is free !!!" );
                        }
                    }else {                                                                         // if (deliveryconfirm == 2)
                        System.out.println("We are waiting for you in our restaurant!");
                    }
                } else if (orderconfirm == cancelChoise ) {
                    System.out.println("Your order is canceled! ");
                    System.out.println("---------------------------------");
                    System.out.println("Thank you for visiting our online restaurant!\n ");
                }


            }else {
                System.out.printf(" You've ordered to many %s at once \n " , FOOD_2_NAME);
                System.out.println(" Restart the page and make another order :) ");
            }
            
           
            // // IF THIRD OPTION IS CHOSEN

        } else if (option == 3){
            System.out.println("Your choise is: " + FOOD_3_NAME);  
            System.out.print("How many do you want: ");
            int quantity = in.nextInt();
            float totalCost = quantity *FOOD_3_PRICE;
            if (quantity <= food_3_available_quantity){
                System.out.println("Total: " + totalCost + CURRENCY );
                System.out.print("<<<For order confirmation press: \"1\" or press :\"2\" to cancel order>>> ");
                int orderconfirm = in.nextInt();
                if (orderconfirm == validChoise ){
                    System.out.println("Your order will be prepared immediately!");
                    System.out.print("To request delivery press 1; press 2 for take away:  ");
                    int deliveryconfirm = in.nextInt();
                    if ( deliveryconfirm == 1 ){
                        if ( totalCost < 200 ){
                        System.out.println("Due to your total Order delivery will cost: " + deliveryCost + CURRENCY);
                        }else{
                        System.out.printf("Due to your total Order delivery is free !!!" );
                        }
                    }else {                                                                         // if (deliveryconfirm == 2)
                        System.out.println("We are waiting for you in our restaurant!");
                    }
                } else if (orderconfirm == cancelChoise ) {
                    System.out.println("Your order is canceled! ");
                    System.out.println("---------------------------------");
                    System.out.println("Thank you for visiting our online restaurant!\n ");
                }


            }else {
                System.out.printf(" You've ordered to many %s at once \n " , FOOD_3_NAME);
                System.out.println(" Restart the page and make another order :) ");
            }  
        }

       
        
        


        









    }
}