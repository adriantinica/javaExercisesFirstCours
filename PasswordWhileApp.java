import java.util.Scanner;
public class PasswordWhileApp {
    /**
     * @param args
     */
    public static void main(String[] args) {
    
        Scanner in = new Scanner (System.in);
        final int secretPIN = 1234;
        int pin = 0;
        byte increment = 0;


        // do{
        //     System.out.println("Enter PIN: ");
        //     pin = in.nextInt();
        // } while (pin != secretPIN);

        while ( increment <= 2 ){
            System.out.println("Enter PIN: ");
            pin = in.nextInt();

            if ( pin == secretPIN ) {
                System.out.println("Login Successfully !!!");
                break;
            }

           
            while ( pin != secretPIN ){
                System.out.println("WRONG PIN");
                
                increment ++;
                
                
                if ( increment == 3 ) {
                    System.out.println("WARNING !!!");
                    System.out.println("Acount is blocked; Maximum tries 3 !!! ");
                }  break ;      
         
            }  
           

        }
        
 
    }   
}