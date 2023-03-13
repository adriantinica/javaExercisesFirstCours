import java.io.PrintStream;

public class WeightConverterApp {
    
    /**
     * https://www.wikihow.com/Convert-Pounds-to-Kilograms
     * @param args
     */
    
    public static void main(String[] args) {
       
      // DATA
     
     double kgInitialWeight  = 10;
     double lbsInitialWeight = 20;
     double lbs_KgConverterIndex = 0.454;
     double kg_LBSConverterIndex = 2.204;
     
      // Logic
    
      //lbsInitialWeight = kgInitialWeight * kg_LBSConverterIndex ; convert kg to lbs
       kgInitialWeight = lbsInitialWeight * lbs_KgConverterIndex ;   //convert lbs to kg
      
     // PRINT
     
       //System.out.println ( kgInitialWeight + " kg " + " = " + lbsInitialWeight + " lbs ");  print result converting kg to lbs
        System.out.println ( lbsInitialWeight + " lbs " + " = " + kgInitialWeight + " kg " );  // print result converting lbs to kg
      
     
    }
}
