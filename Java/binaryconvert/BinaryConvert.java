package binaryconvert;

import java.util.Scanner;

public class BinaryConvert {

    public static void main(String[] args) {

// solve 1. Use Integer.parseInt         
//        Scanner sc = new Scanner(System.in);
//        int binary;
//        String binaryString;
//
//        System.out.print("Enter a binary number (0~11111): ");
//        binaryString = sc.nextLine();
//
//        int decimal = Integer.parseInt(binaryString, 2);
//        System.out.println(binaryString + "(2) is " + decimal + "(10)");
//
//
// solve 2. Make a logic
        Scanner sc = new Scanner(System.in);
        int binary;
        int n = 0;
        int decimal = 0;

        System.out.print("Enter a binary number (0~11111): ");
        binary = sc.nextInt();
        int binaryResult = binary;

        while (binary != 0) {
            int temp = binary % 10;
            decimal += temp * Math.pow(2, n);
            binary = binary / 10;
            n++;
        }
        System.out.println(binaryResult + "(2) is " + decimal + "(10)");
    }

}
