import java.nio.file.*;
import java.io.*;

public class WordReaderFromFile {

    public static void main(String[] args) {
            Path file = Paths.get("message.txt");
            InputStream input = null;

            try {
                input = Files.newInputStream(file);
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                String s = null;
                s = reader.readLine();
                System.out.println(s);
                input.close();
            } catch (IOException e) {
                System.out.println(e);
            }
    }
}
