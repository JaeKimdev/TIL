package asciiart;

import java.util.Scanner;

public class AsciiArt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rectangle width: ");
        int x = sc.nextInt();
        System.out.print("Enter Rectangle height: ");
        int y = sc.nextInt();

        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++) {
                if (i == 1 || i == x) {
                    System.out.print("#");
                } else if (j == 1 || j == x) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.print("\nEnter triangle height: ");
        int z = sc.nextInt();

        for (int i = 1; i <= z; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == 2 || i == z) {
                    System.out.print("#");
                } else if (j == 1 || j == i ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
            }
        }
    }
