package chapter3;

/*
multiline comments work the same as in javascript
hello from line 2 of this comment

IF statement.
All sales people get 1000/week
Sales people with >10 sales get a 250 dollar bonus
 */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String args[]) {

        //initialize the known values as variables
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //get the unknown values
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for bonus earners
        if(sales > quota) {
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is $" + salary);
    }
}
