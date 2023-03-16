import java.util.Scanner;
public class VersionCompApp{
    public static void main(String[] args) {
        // this app will compare to java program versions
        // same = ; older < ; newer >
        // M. m. p.


        // DATA

        Scanner kbd = new Scanner (System.in);

        System.out.print("Input your home program MAJOR increment : ");
        double homeProgramVersionM = kbd.nextDouble();
        System.out.print("Input your home program MINOR increment : ");
        double homeProgramVersion_m = kbd.nextDouble();
        System.out.print("Input your home program PATCH increment : ");
        double homeProgramVersion_p = kbd.nextDouble();

        System.out.print("Input your office program MAJOR increment : ");
        double officeProgramVersionM = kbd.nextDouble();
        System.out.print("Input your office program MINOR increment : ");
        double officeProgramVersion_m = kbd.nextDouble();
        System.out.print("Input your office program PATCH increment : ");
        double officeProgramVersion_p = kbd.nextDouble();

        // LOGIC

        if (homeProgramVersionM > officeProgramVersionM) {
            System.out.println("Home program version is newer then office");
        } else if(homeProgramVersionM < officeProgramVersionM){
            System.out.println("Home program version is older then office");
        } else if(homeProgramVersionM == officeProgramVersionM){
            if (homeProgramVersion_m > officeProgramVersion_m){
                System.out.println("Home program version is newer then office");
            }else if (homeProgramVersion_m < officeProgramVersion_m){
                System.out.println("Home program version is older then office");
            }else if (homeProgramVersion_m == officeProgramVersion_m){
                if (homeProgramVersion_p > officeProgramVersion_p){
                    System.out.println("Home program version is newer then office");
                } else if (homeProgramVersion_p < officeProgramVersion_p){
                    System.out.println("Home program version is older then office");
                } else {
                    System.out.println("You have instaled same version ");
                }
            }
        }


     }
}
