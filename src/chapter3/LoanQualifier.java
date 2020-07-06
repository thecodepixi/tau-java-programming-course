package chapter3;
/*
NESTED IFs:
* To qualify for a loan you must make at least 30k per year
* and have been at your job for 2+ years
 */

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String args[]) {

        // Initialize known values
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // get unknown values
        System.out.println("Enter your salary...");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years you've been at your current job...");
        double years = scanner.nextDouble();
        scanner.close();

        // make decision and output result
        if( salary >= requiredSalary) {
            if( years >= requiredYearsEmployed) {
                System.out.println("Congrats! You qualify for a loan!");
            }
            else {
                System.out.println("Sorry, you must have worked for your current employer " +
                        "for at least " + requiredYearsEmployed + " years.");
            }
        }
        else {
            System.out.println("Sorry, you must make more than $" + requiredSalary + " per year." );
        }
    }
}
