package chapter3;

import java.util.Scanner;

/*
* IF ELSE
* All salespeople are expected to make at least 10 sales per week
* Those who do receive a congratulatory message
* those who don't are informed how many sales short they were
 */
public class QuotaCalculator {

    public static void main(String args[]) {

        // Initialize values we know
        int quota = 10;

        //get unknown values
        System.out.println("Enter the number of sales you made this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //make decision and output
        if(sales >= quota) {
            System.out.println("Congrats! You've met your quota!");
        }
        else {
            int difference = quota - sales;
            System.out.println("You did not meet your quota. You were " + difference + " sales short this week.");
        }
    }
}
