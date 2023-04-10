import java.util.Scanner;
public class DataFlowApp {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("""
        1 Integer To Byte  
        2 Byte To Integer
        3 Double To Integer 
        4 Integer To Double 
        5 Short To Integer 
        6 Integer To Short 
        """);
        System.out.println("Choose the conersion: ");
        byte typeInput = input.nextByte();
       
        if (typeInput == 1){
            System.out.print("Enter an integer: ");
            int num1 = input.nextInt();
            if (num1 < Byte.MIN_VALUE || num1 > Byte.MAX_VALUE) {
                System.err.println("Error: The input number is too big to fit into a byte.");
            }else {
                byte numByte = DataTransformer.integerToByte(num1);
                System.out.println(num1 + " as a byte is: " + numByte);
            }    
        }
        if (typeInput == 2){
            System.out.print("Enter a byte: ");
            Byte num2 = input.nextByte();
            int numInt = DataTransformer.byteToInteger(num2);
            System.out.println(num2 + " as integer is: " + numInt);
               
        }



        if (typeInput == 3){
            System.out.print("Enter a double: ");
            double num3 = input.nextDouble();
            if (num3 < Integer.MIN_VALUE || num3 > Integer.MAX_VALUE) {
                System.err.println("Error: The input number is too big to fit into a integer.");
            }else {
                int numInt = DataTransformer.doubleToInteger(num3);
                System.out.println(num3 + " as  integer is: " + numInt);
            }    
        }
        if (typeInput == 4){
            System.out.print("Enter an integer: ");
            int num3 = input.nextInt();
            Double numDouble = DataTransformer.integerToDouble(num3);
            System.out.println(num3 + " as double is: " + numDouble);
        } 
        
        

        if (typeInput ==6){
            System.out.print("Enter an integer: ");
            int num3 = input.nextInt();
            if (num3 < Short.MIN_VALUE || num3 > Short.MAX_VALUE) {
                System.err.println("Error: The input number is too big to fit into a short.");
            }else {
                int numInt = DataTransformer.integerToShort(num3);
                System.out.println(num3 + " as  integer is: " + numInt);
            }    
        }
        if (typeInput == 5){
            System.out.print("Enter a short: ");
            Short num3 = input.nextShort();
            int numInt = DataTransformer.shortToInteger(num3);
            System.out.println(num3 + " as  short is: " + numInt);
        }    
        
        
    }
}

// secondary class
class DataTransformer {
   
    
    public static byte integerToByte(int num) {
        return (byte) num;
    }

    public static int byteToInteger(byte num) {
        return (int) num;
    }

    public static int doubleToInteger(double num) {
        return (int) num;
    }

    public static double integerToDouble(int num) {
        return (double) num;
    }

    public static int shortToInteger(short num) {
       return (int) num;
    }

    public static short integerToShort(int num) {
       return (short) num;
    }
}        
   