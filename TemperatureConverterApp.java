import java.io.PrintStream;

public class TemperatureConverterApp {
    
    /**
     * https://www.wikihow.com/Convert-Pounds-to-Kilograms
     * @param args
     */
    
    public static void main(String[] args) {
       
      // DATA
     
     double CelsiusInitialTemp  = 10;
     double FahrenheitInitialTemp = 20;

     //   Logic
     double Celsius_FahrConverterIndex = (CelsiusInitialTemp *  9/5) + 32  ;
     double Fahr_CelsiusConverterIndex = (FahrenheitInitialTemp - 32) * 5/9 ;
    
     // Print

     System.out.println (CelsiusInitialTemp + " C " + " = "+ Celsius_FahrConverterIndex + " F " );
     System.out.println (FahrenheitInitialTemp +  " F " + " = "+ Fahr_CelsiusConverterIndex + " C " );
    }
}