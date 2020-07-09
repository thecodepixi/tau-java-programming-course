package homeworkAssignments;

/*
Every overage minute costs .25, tax on subtotal is 15%

SAMPLE OUTPUT:
Enter base cost of the plan:
> 82.45
Enter overage minutes:
> 9
Phone Bill Statement
Plan: $82.45
Overage: $2.25
Tax: $12.71
Total: $97.41
 */

import java.util.Scanner;

public class PhoneBillCalculator {
    // class level variables
    static double overageRatePerMin = 0.25;
    static double taxPercentage = 0.15;
    static Scanner scanner = new Scanner(System.in);

    // main method - calls other methods
    public static void main(String[] args) {
        double planCost = getPlanCost();
        int overageMinutes = getOverageMinutes();
        scanner.close();

        double overageCost = 0;
        if (overageMinutes > 0) {
            overageCost = calculateOverageCost(overageMinutes);
        }

        double tax = calculateTax(overageCost, planCost);

        double totalBill = calculateTotal(planCost, overageCost, tax);

        returnItemizedBill(planCost, overageCost, tax, totalBill);

    }

    // get cost of plan
    public static double getPlanCost() {
        System.out.println("Enter base cost of the plan:");
        return scanner.nextDouble();
    }

    // get overage minutes
    public static int getOverageMinutes() {
        System.out.println("Enter overage minutes:");
        return scanner.nextInt();
    }

    // calculate overage - need overage minutes as input - return overage total
    public static double calculateOverageCost(double overageMinutes) {
        return overageMinutes * overageRatePerMin;
    }

    // calculate tax - need base plan and overage as input - return tax total
    public static double calculateTax(double overage, double planCost) {
        return (overage + planCost) * taxPercentage;
    }

    // calculate total - need base plan, overage, and tax as input - return total
    public static double calculateTotal(double planCost, double overage, double tax) {
        return planCost + overage + tax;
    }

    // return itemized bill - need base, overage, tax, and total as input
    public static void returnItemizedBill(double plan, double overage, double tax, double total) {
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f",plan));
        System.out.println("Overage: $" + String.format("%.2f",overage));
        System.out.println("Tax: $" + String.format("%.2f",tax));
        System.out.println("Total: $" + String.format("%.2f",total));
    }
}
