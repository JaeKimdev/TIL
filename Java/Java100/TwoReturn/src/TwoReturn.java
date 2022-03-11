// Implement a method with two return values.
// When "Korea" and "USA" are input,
// lowercase letters are output into uppercase letters and uppercase letters into lowercase letters.

import java.util.Arrays;
import java.util.Locale;

public class TwoReturn {

    public static String[] makeCapital(String a, String b) {
        String aa = a.toUpperCase();
        String bb = b.toLowerCase();

        String [] ret = {aa , bb};
        return ret;
    }

    public static void main(String[] args) {
        String[] result = makeCapital("korea", "USA");
        System.out.println(result[0] + " , " + result[1]);
        System.out.println(Arrays.toString(result));
    }
}
