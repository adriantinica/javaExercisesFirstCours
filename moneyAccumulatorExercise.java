public class moneyAccumulatorExercise{
    /**
     * @param args
     */
    public static void main(String[]args){
        
        int money1 = 100;
        int money2 = 200;
        int money3 = 300;

        int moneyAccumulator = 0;
        int expenses = 45;

        moneyAccumulator += money1;
        moneyAccumulator += money2;
        moneyAccumulator += money3;

        moneyAccumulator -= expenses;

        System.out.println(moneyAccumulator + " MDL: ");
        System.out.println(" " + money1 +"MDL");
        System.out.println("+" + money2 +"MDL");
        System.out.println("+" + money3 +"MDL");
        System.out.println("--------------");
        System.out.println("-" + expenses +"MDL");
 
         // System.out.println("Eu sunt \nAdrian Tinica ");

    }
}