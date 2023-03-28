import java.util.Scanner;
public class DrawCakeWithForApp {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("wELCOME TO OUR STANDART CAKE STORE");
       System.out.print("Choose the width of the cake(cm): ");
       int cakeWidth = in.nextInt();
       final int SMOKE  = 1; 
       final int FIRE   = 2; 
       final int CANDLE = 3; 
       final int CREAM  = 4; 
       final int BASE   = 5; 


       for(int level= 1; level <= 5 ;level++) { 
           switch(level) {
               case SMOKE:
                    for(int lines=1; lines<=2; lines++) {
                      for(int elements=1; elements<=cakeWidth/2; elements++) {
                         System.out.print(" .");
                        }
                        System.out.println();
                    }
                break;
                case FIRE:
                    for(int lines=1; lines<=1; lines++) {
                        for(int elements=1; elements<=cakeWidth/2; elements++) {
                            System.out.print(" ^");
                        }
                        System.out.println();
                    }
                break;
                case CANDLE:
                    for(int lines=1; lines<=1; lines++) {
                        for(int elements=1; elements<=cakeWidth/2; elements++) {
                            System.out.print(" |");
                        }
                        System.out.println();
                    }
                break;
                case CREAM:
                    for(int lines=1; lines<=1; lines++) {
                        for(int elements=1; elements<=cakeWidth+1; elements++) {
                            System.out.print("~");
                        }
                        System.out.println();
                    }
                break;
                case BASE:
                    for(int lines=1; lines<=3; lines++) {
                        for(int elements=1; elements<=cakeWidth+1; elements++) {
                            System.out.print("#");
                        }
                        System.out.println();
                    }
               break;
           }
       }


    }
}