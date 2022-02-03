package eggscount;

import java.util.Scanner;

public class EggsCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many eggs? :");
        
        int total = sc.nextInt();
        int gross = total / 144;
        int totalRemain = total - (144 * gross);
        int dozen = totalRemain / 12;
        int dozenRemain = totalRemain % 12;
        
        System.out.println("You have " + gross + " gross and " + dozen + " dozens of eggs, and " + dozenRemain + " egg(s) left.");
        
    }
    
}
