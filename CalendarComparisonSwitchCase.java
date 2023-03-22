import java.util.Scanner;

public class CalendarComparisonSwitchCase {

    public static void main(String[] args) {
    
        //Data Input

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the day of the week (1,2,3...) ");
    int inputDay =input.nextInt();
    System.out.print("Choose the calendar type (1 >>> USA and others.. / 2 >>> Europe.. ):");
    int inputCalendarType = input.nextInt();

    System.out.println();

        // LOGIC
    
        if (inputCalendarType == 1){
            switch (inputDay) {
                case 1: System.out.printf("The %d day of the week is \"Sunday\" " , inputDay); break;
                case 2: System.out.printf("The %d day of the week is \"Monday\" ", inputDay); break;
                case 3: System.out.printf("The %d day of the week is \"Tuesday\" ", inputDay); break;
                case 4: System.out.printf("The %d day of the week is \"Wednesday\" ", inputDay); break;
                case 5: System.out.printf("The %d day of the week is \"Thursday\" ", inputDay); break;
                case 6: System.out.printf("The %d day of the week is \"Friday\" ", inputDay); break;
                case 7: System.out.printf("The %d day of the week is \"Saturday\" ", inputDay); break;
            
                default:System.out.println("NO SUCH DAY !!!");
                    break;
            }
        }else if (inputCalendarType == 2) {

            switch (inputDay) {
                
                case 1: System.out.printf("The %d day of the week is \"Monday\" ", inputDay); break;
                case 2: System.out.printf("The %d day of the week is \"Tuesday\" ", inputDay); break;
                case 3: System.out.printf("The %d day of the week is \"Wednesday\" ", inputDay); break;
                case 4: System.out.printf("The %d day of the week is \"Thursday\" ", inputDay); break;
                case 5: System.out.printf("The %d day of the week is \"Friday\" ", inputDay); break;
                case 6: System.out.printf("The %d day of the week is \"Saturday\" ", inputDay); break;
                case 7: System.out.printf("The %d day of the week is \"Sunday\"", inputDay); break;
                default: System.out.println("NO SUCH DAY !!!");
                    break;
            }    
        }

        System.out.println();
    
    }
}