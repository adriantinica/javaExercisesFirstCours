import java.util.Scanner;

public class FirstInputApp {
    public static void main(String[] args) {
        // DATA
        double averageScore;
        // INPUT DATA 
        Scanner in = new Scanner (System.in); 
        System.out.print("Insert first student score: ");
        double student1 = in.nextDouble();
        System.out.print("Insert second student score: ");
        double student2 = in.nextDouble();
        System.out.print("Insert third student score: ");
        double student3 = in.nextDouble();
        
        
        // LOGIC

        averageScore = (student1 + student2 + student3) /3;

        System.out.println();
        System.out.println(" First student score: " + student1 );
        System.out.println(" Second student score: " + student2 );
        System.out.println(" Third student score: " + student3 );
        System.out.println(" Average score: " + averageScore );
        System.out.println();



    }


}
