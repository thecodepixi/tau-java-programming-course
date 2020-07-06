package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String args[]) {

        //get the number of hours the employee worked
        System.out.println("Enter hours worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //get the hourly pay rate
        System.out.println("Enter the employee pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();

        //multiply hours by pay rate
        double grossPay = hours * rate;

        //display result
        System.out.println("The employees gross pay is $" + grossPay);
    }
}
