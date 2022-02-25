import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Scheduler {
    int temp;
    Scanner sc = new Scanner(System.in);

    public void checkTemp() {
        System.out.print("What is Today's Temperature(℃)? ");
        temp = sc.nextInt();
    }

    public void makeScedule(ArrayList<Team> teams, ArrayList<Game> games, int temp) {
        Game g1 = new Game();
        Game g2 = new Game();
        Collections.shuffle(teams);
        g1.playGame(teams.get(0), teams.get(1), temp);
        g2.playGame(teams.get(2), teams.get(3), temp);
        games.add(g1);
        games.add(g2);
    }
}
