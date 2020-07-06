package chapter3;

import java.util.Scanner;
// SWITCH
public class GradeMessage {
    public static void main(String args[]) {
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message;
        // Switch decision
        switch(grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job.";
                break;
            case "D":
                message = "Try harder next time.";
                break;
            case "F":
                message = "You failed =( ";
                break;
            default:
                message = "Error. Invalid letter grade provided.";
                break;
        }

        System.out.println(message);
    }
}


