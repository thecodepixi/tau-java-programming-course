package chapter3;

import java.util.Scanner;

//IF ELSE-IF
public class TestResults {

    public static void main(String args[]) {

        //get test score from user
        System.out.println("Enter your test score...");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        //determine letter grade
        char grade;  // initialized variable without assignment

        if(score < 60) {
            grade = 'F'; // char type uses single quotes
        }
        else if(score < 70) {
            grade = 'D';
        }
        else if(score < 80) {
            grade = 'C';
        }
        else if(score < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }

        System.out.println("Your grade is " + grade );
    }
}
