package chapter5;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class InstantCreditCheck {
    static int requiredSalary = 25_000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // get user info
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();
        // check if they qualify
        boolean isQualified = isUserQualified(creditScore, salary);

        notifyUser(isQualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary: ");
        return scanner.nextDouble();
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score: ");
        return scanner.nextInt();
    }

    public static boolean isUserQualified(int creditScore, double salary){
        return creditScore >= requiredCreditScore && salary >= requiredSalary;
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congrats! You qualify for a loan!");
        }
        else {
            System.out.println("Sorry, you do not qualify.");
        }
    }
}
