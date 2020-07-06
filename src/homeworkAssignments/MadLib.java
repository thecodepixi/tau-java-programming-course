package homeworkAssignments;

import java.util.Scanner;

public class MadLib {

    public static void main(String args[]) {

        //ask for adjective
        System.out.println("Give me an adjective...");
        Scanner scanner = new Scanner(System.in);
        String adj = scanner.next();

        //ask for season of the year
        System.out.println("Give me a season...");
        String season = scanner.next();

        //ask for a whole number
        System.out.println("Give me a whole number...");
        int wholeNum = scanner.nextInt();
        scanner.close();

        //return completed sentence
        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of " + wholeNum + " cups of coffee.");
    }
}
