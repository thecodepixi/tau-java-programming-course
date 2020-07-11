package homeworkAssignments;

public class CoffeeMaker {
    // class 'fields'
    private int coffeePerCup;
    private int waterPerCup;
    public int cupsToMake;

    // initialize class with number of cups of coffee requested
    public CoffeeMaker(int cupsToMake) {
        coffeePerCup = 20;
        waterPerCup = 14;
        this.cupsToMake = cupsToMake;
    }

    // method to make coffee
    public void makeCoffee() {
        int coffeeNeeded = coffeePerCup * cupsToMake;
        int waterNeeded = waterPerCup * cupsToMake;

        System.out.println("You will need " + waterNeeded + " oz. of water and " + coffeeNeeded + " grams of coffee beans to make " + cupsToMake + " cups of coffee.");
    }

    public static void main(String[] args) {
        // Yep! we're initializing an instance of the class inside the class itself!
        CoffeeMaker myOrder = new CoffeeMaker(5);
        myOrder.makeCoffee();
        myOrder.cupsToMake = 7;
        myOrder.makeCoffee();

        // Console Output
        // > You will need 70 oz of water and 100 grams of coffee to make 5 cups of coffee.
    }
}
