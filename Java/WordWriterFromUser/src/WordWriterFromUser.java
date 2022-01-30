import java.nio.file.*;
import java.io.*;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;

public class WordWriterFromUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Path file = Paths.get("message.txt");
        System.out.print("Please put single word to save into a file: ");
        String s = sc.nextLine();
        byte[] data = s.getBytes();
        OutputStream output = null;

        try {
            output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            output.write(data);
            output.flush();
            output.close();
        } catch (Exception e) {
            System.out.println("Message: " + e);
        }
    }
}
