package homeworkAssignments;

import java.util.Scanner;

public class ChangeForADollar {
   public static void main(String args[]) {
       // initialize vars
       double pennies;
       double nickles;
       double dimes;
       double quarters;
       double total;
       int dollar = 1;

       // initialize values of each coin type
       double pennieValue = .01;
       double nickleValue = .05;
       double dimeValue = .10;
       double quarterValue = .25;

       //get quantities from user
        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        pennies = scanner.nextInt();

        System.out.println("How many nickles would you like?");
        nickles = scanner.nextInt();

        System.out.println("How many dimes would you like?");
        dimes = scanner.nextInt();

        System.out.println("How many quarters would you like?");
        quarters = scanner.nextInt();

        // calculate value of all change
       total = (pennies * pennieValue) + (nickles * nickleValue) + (dimes * dimeValue) + (quarters * quarterValue);

       if(total < dollar) {
           System.out.println("Sorry, you were under by " + String.format("%.2f", (dollar - total)) + " cents.");
       }
       else if( total > dollar) {
           System.out.println("Sorry, you went over by $" + String.format("%.2f", (total - dollar)) );
       }
       else {
           System.out.println("You win! That's exactly $1.00!");
       }

   }
}

