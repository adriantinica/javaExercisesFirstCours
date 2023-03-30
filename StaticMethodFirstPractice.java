/**
 * It should be called Busyapp :):):)
*/
import java.util.Scanner;
public class StaticMethodFirstPractice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Welcome to BUSY APP");;
        System.out.println();
        System.out.println("1. English \n2. French \n3. Chinese \n4. German \n5. Latvian");
        System.out.print("Enter your name here: ");
        String nameInput = in.nextLine();
        System.out.print("Choose your Nationality: ");
        int nationInput = in.nextInt();
        System.out.print("Enter your age: ");
        Short ageInput = in.nextShort();
        System.out.println();
        
        if (nationInput == 1){
            English.hi(nameInput);
            English.age(ageInput); 
            System.out.println("I'm busy now !!!");
            English.bye(nameInput);

        }else if (nationInput == 2){
            French.hi(nameInput);
            French.age(ageInput);
            System.out.println("I'm busy now !!!");
            French.bye(nameInput);

        }else if (nationInput == 3){
            Chinese.hi(nameInput);
            Chinese.age(ageInput);
            System.out.println("I'm busy now !!!");
            Chinese.bye(nameInput);

        }else if (nationInput == 4){
            German.hi(nameInput);
            German.age(ageInput);
            System.out.println("I'm busy now !!!");
            German.bye(nameInput);

        }else if (nationInput == 5){
            Latvian.hi(nameInput);
            Latvian.age(ageInput);
            System.out.println("I'm busy now !!!");
            Latvian.bye(nameInput);

        }else{ 
            System.out.println(      "Error, try again.....");
            System.out.println();
        }
        System.out.println();
        

    }
}



class English{
    static void hi(String nameInput ){
        System.out.println("Hello " + nameInput  + " !!!");
    }
    static void bye(String nameInput ){
        System.out.println("Goodbye " + nameInput + " !!!");
    }
    static void age( Short ageInput){
        System.out.println("You are " + ageInput + " years old");
    }
}

class French{
    static void hi(String nameInput ){
        System.out.println("Bonjour " + nameInput  + " !!!");
    }
    static void bye(String nameInput ){
        System.out.println("Au revoir " + nameInput  +" !!!");
    }
    static void age( Short ageInput){
        System.out.println("Tu as " + ageInput + " ans.");
    }
}

class Chinese{
    static void hi(String nameInput ){
                            // 你好 
        System.out.println("Ni hao " + nameInput  + " !!!");
    }
    static void bye(String nameInput ){
                            // 再见  
        System.out.println("Zaijian " + nameInput  + " !!!");
    }
    static void age( Short ageInput){
        System.out.println("Ni " + ageInput + " sui.");
    }
}

class German{
    static void hi(String nameInput ){
        System.out.println("Hallo " + nameInput  + " !!!");
    }
    static void bye(String nameInput ){
        System.out.println("Verabschiedung " + nameInput  + " !!!");
    }
    static void age( Short ageInput){
        System.out.println("Du bist " + ageInput + " jahre alt.");
    }
}

class Latvian{
    static void hi(String nameInput ){
        System.out.println("Sveiki " + nameInput  + " !!!");
    }
    static void bye(String nameInput ){
        System.out.println("Ardievu " + nameInput  + " !!!");
    }
    static void age( Short ageInput){
        System.out.println("Tev ir " + ageInput + " gadi");
    }
}