package soccergame;

import java.util.ArrayList;
import java.util.Collections;

public class Scheduler {

    public void makeSchedule(ArrayList<Team> teams, ArrayList<Game> games, int temp) {
        Game g1 = new Game();
        Game g2 = new Game();
        Collections.shuffle(teams);
        g1.playGame(teams.get(0), teams.get(1), temp);
        g2.playGame(teams.get(2), teams.get(3), temp);
        games.add(g1);
        games.add(g2);
    }
}
