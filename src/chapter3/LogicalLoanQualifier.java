package chapter3;
/*
LOGICAL OPERATORS:
* To qualify for a loan you must make at least 30k per year
* and have been at your job for 2+ years
 */

import java.util.Scanner;

public class LogicalLoanQualifier {

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
        if( salary >= requiredSalary && years >= requiredYearsEmployed) {
            System.out.println("Congrats! You qualify for a loan!");
        }
        else {
            System.out.println("Sorry, you must make more than $" + requiredSalary + " per year, " +
                    "and have worked for your employer at least " + requiredYearsEmployed + " years." );
        }
    }
}
