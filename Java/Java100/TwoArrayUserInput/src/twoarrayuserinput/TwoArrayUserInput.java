package twoarrayuserinput;

import java.util.Scanner;

public class TwoArrayUserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input number of row: ");
        int row = sc.nextInt();
        System.out.print("Please input number of column: ");
        int column = sc.nextInt();

        char[][] gameMap = new char[row][column];

        String[] strAr = new String[row];

        for (int i = 0; i < row; i++) {
            System.out.printf("Enter %d characters to enter in the %d row and enter. ", column, (i+1));
            strAr[i] = sc.next();
            for (int j = 0; j < column; j++) {
                gameMap[i][j] = strAr[i].charAt(j);
            }
        }
        System.out.println("--------------------");
        for (int i=0; i <row; i++) {
            for (int j=0; j<column; j++) {
                System.out.print(gameMap[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("--------------------");

    }

}
