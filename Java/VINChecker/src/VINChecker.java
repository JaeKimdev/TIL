import java.util.Scanner;

public class VINChecker {

    static String error = "";
    static String invalidChar = "";
    static boolean valid = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter VIN: ");
        String vin = sc.next().toUpperCase();

        int weight[] = {8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2};
        int checksum = 0;

        if (vin.length() != 17) {
            error = !valid ? error : "The VIN must contain 17 characters, not " + vin.length();
            valid = false;
        } else {
            for (int i = 0; i <= 16; i++) {
                checksum += letterValue(vin.charAt(i)) * weight[i];
            }

            checksum %= 11;
            for (int i = 13; i <= 16; i++) {
                if (!Character.isDigit(vin.charAt(i))) {
                    error = !valid ? error : "Last four characters must be digits";
                    valid = false;
                }
            }

            if (checksum != 10 && !vin.substring(8, 9).equals(String.valueOf(checksum))
                    || checksum == 10 && vin.charAt(8) != 'X') {
                error = !valid ? error : "The check digit is NOT correct";
                valid = false;
            }
        }

        System.out.println(valid
                ? "\nWorld Manufacturer Identification: " + vin.substring(0, 3)
                + "\n\tCountry: " + vin.charAt(0) + "\n\tManufacturer: "
                + vin.charAt(1) + "\n\tMake: " + vin.charAt(2)
                + "\nVehicle Description Section: " + vin.substring(3, 8)
                + "\nCheck Digit: " + vin.charAt(8)
                + (vin.charAt(8) != 'X' ? "" : "(10)")
                + "\nVehicle Identification Section: " + vin.substring(9)
                + "\n\tModel Year: " + vin.charAt(9) + "\n\tPlant: "
                + vin.charAt(10) + "\n\tSequential Production Number: "
                + vin.substring(11, 17) + "\n"
                : "Invalid VIN: " + error + invalidChar);
    }

    private static int letterValue(char ch) {
        int value = 0;

        switch (ch) {
            case '1', 'A', 'J' ->
                    value = 1;

            case '2', 'B', 'K', 'S' ->
                    value = 2;

            case '3', 'C', 'L', 'T' ->
                    value = 3;

            case '4', 'D', 'M', 'U' ->
                    value = 4;

            case '5', 'E', 'N', 'V' ->
                    value = 5;

            case '6', 'F', 'W' ->
                    value = 6;

            case '7', 'G', 'P', 'X' ->
                    value = 7;

            case '8', 'H', 'Y' ->
                    value = 8;

            case '9', 'R', 'Z' ->
                    value = 9;

            case '0' ->
                    value = 0;

            default -> {
                error = !valid ? error : "Illegal characters: ";
                valid = false;
                invalidChar = invalidChar + String.valueOf(ch) + " ";
            }
        }
        return value;
    }
}
