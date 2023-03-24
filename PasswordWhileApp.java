import java.util.Scanner;
public class PasswordWhileApp {
    public static void main(String[] args) {
    
        Scanner in = new Scanner (System.in);
        final int secretPIN = 1234;
        int pin = 0;
        do{
            System.out.println("Enter PIN: ");
            pin = in.nextInt();
        } while (pin != secretPIN);
        
        if ( pin == secretPIN ) {
            System.out.println("Login Successfully !!!");
        }


    }   
}