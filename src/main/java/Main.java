import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner name = new Scanner(System.in);
        System.out.println("Hey! What's your name?");
        String fName = name.nextLine();

        if( (fName.equals("Alice")) || (fName.equals("Bob")) ){
            System.out.println("Hi" + fName + "How are you");
        }
        else{
            System.out.println("who are you?");

        }

    }
}
