import java.time.MonthDay;

public class PeriodConverterExample {
     public static void main(String[] args) {
        
        // # DATA - CONSTANTS    
    final int YEAR_DAYS = 365;
    final int MONTH_DAYS = 30;
    final int WEEK_DAYS =  7;    

    // # DATA - variables
    int periodDays = 123789 ;
    int toYears ;
    int toMonth ;
    int toWeeks ;
    int var; 
    int var1;
    int toDAYS;
    int verificationVar;

    // # CALCULATIONS
   
    toYears = periodDays / YEAR_DAYS;  // whole years
    var = periodDays % YEAR_DAYS;   // the rest of the days 
    toMonth = var / MONTH_DAYS;    // whole month
    var1 = var % MONTH_DAYS;       //the rest of the days
    toWeeks = var1 / WEEK_DAYS;    //whole weeks
    toDAYS = var1 % WEEK_DAYS;       // the rest of the days

    // ???



    // # PRINT RESULTS

    System.out.println(
        "Total Period Days" + "( " + periodDays + " ) = "
         + toYears + " YEARS " + toMonth + " MONTHS " + toWeeks + " WEEKS " + toDAYS + " DAYS "
    );
   
    

    }
}