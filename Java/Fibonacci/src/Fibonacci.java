import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int maxNumber = sc.nextInt();
        int previousNumber = 0;
        int nextNumber = 1;
        int sum = 0;

        do {
            System.out.print(sum + " ");
            sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        } while (sum < maxNumber);
    }
}
