import java.util.Scanner;

public class EggsOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //user input through Scanner
        // Declare some variables
        int eggs;
        double totalCost;
        int amountOfDozen;
        int amountOfEgg;

        System.out.print("How many eggs do you want to buy? : ");
        //error trapping - if input not integer
        while (!sc.hasNextInt()) {
            System.out.print("Please input number value, How many eggs do you want to buy? : ");
            sc.nextLine();
        }
        eggs = sc.nextInt();

        if(eggs >= 0) {
            amountOfDozen = eggs / 12;  
            amountOfEgg = eggs % 12;
            totalCost = (amountOfDozen * 7.25) + (amountOfEgg * 0.75);
            if (amountOfDozen == 0) {
                System.out.println("You ordered " + eggs + " eggs. That is " + amountOfEgg + " eggs at $0.75 each for a total of $" + String.format("%.2f", totalCost));
            } else if (amountOfEgg == 0) {
                System.out.println("You ordered " + eggs + " eggs. That is " + amountOfDozen + " dozen eggs at $7.25 per dozen for a total of $" + String.format("%.2f", totalCost));
            } else {
                System.out.println("You ordered " + eggs + " eggs. That is " + amountOfDozen + " dozen eggs at $7.25 per dozen and " + amountOfEgg + " additional eggs at $0.75 each for a total of $" + String.format("%.2f", totalCost));
            }
        } else {
            System.out.println("Error! Please input plus number!"); //error trapping - if user input not plus value
        }
    }
}