import java.util.Scanner;

public class TestClock {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner hh = new Scanner(System.in);
        Scanner mm = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        Clock cl = new Clock();

        int command;

        do {
            cl.show();
            command = sc.nextInt();

            if (command == 1) {
                System.out.println("Now you can set the clock");
                System.out.print("Enter hour(0 ~ 23): ");
                int hourInput = hh.nextInt();
                System.out.print("Enter hour(0 ~ 59): ");
                int minuteInput = mm.nextInt();
                System.out.print("Enter hour(0 ~ 59): ");
                int secondInput = ss.nextInt();
                cl.setTime(hourInput, minuteInput, secondInput);
            } else if (command == 2) {
                cl.tick();
            } else if (command == 3) {
                cl.reset();
            }

        } while (command != 4);
    }


}
