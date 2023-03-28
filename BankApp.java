import java.util.Scanner;
public class BankApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int PIN = 1234;
        System.out.println("Welcome to " + Bank.name + "!!!"); 
        byte increment = 0;
        

        while ( increment <= 2 ){
            System.out.print("Insert your CARD and enter the PIN: ");
            int inputPin = input.nextInt();

            if ( inputPin == PIN ) {
                System.out.println("Login Successfully !!!");
                System.out.println("Enter withdrow amount: ");
                Float amount = input.nextFloat();
              
                if (amount <= Bank.balance) {
                    Float result = Bank.balance -  amount;
                    System.out.println("Dont leave, you'll receive the money");
                    System.out.printf("Your new balance is %10.2f MDL \n", result );
                    
                } else {
                    System.out.println("Sorry, you have no enoth resources");
                    System.out.printf("Your current balance is %10.2f MDL \n", Bank.balance );
                    System.out.println("Try another amount !!!");
                }
                System.out.printf("Thank you for using %s ATM \n", Bank.name);
              
            }
            
            while ( inputPin != PIN ){
                System.out.println("WRONG PIN");
                
                increment ++;
                
                
                if ( increment == 3 ) {
                    System.out.println("WARNING !!!");
                    System.out.println("Acount is blocked; Maximum tries 3 !!! ");
                }  break ;      
         
            }  
            System.out.println();
        }

    }

    
}


class Bank{
    final static String name = "National Programing Bank ";
    static Float balance = 1_000_000_000f;
    
    
}


