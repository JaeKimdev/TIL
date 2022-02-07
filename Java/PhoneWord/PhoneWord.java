import java.util.Arrays;
import java.util.Scanner;

public class PhoneWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phoneNumber = sc.next();
        String phoneNumberUpper = phoneNumber.toUpperCase(); //Make lowerCase to UpperCase
        String newPhoneNumber;

        //Method 1. Use replace
        newPhoneNumber = phoneNumberUpper.replace("A", "2").replace("B", "2").replace("C", "2").replace("D", "3").replace("E", "3").replace("F", "3").replace("G", "4").replace("H", "4").replace("I", "4").replace("J", "5").replace("K", "5").replace("L", "5").replace("M", "6").replace("N", "6").replace("O", "6").replace("P", "7").replace("Q", "7").replace("R", "7").replace("S", "7").replace("T", "8").replace("U", "8").replace("V", "8").replace("W", "9").replace("X", "9").replace("Y", "9").replace("Z", "9");

        System.out.print(newPhoneNumber);

    }
}