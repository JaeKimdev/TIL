package soccergame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SoccerGame {

    static ArrayList<Team> teams = new ArrayList<>();
    static ArrayList<Game> games = new ArrayList<>();
    static int temp;
    static int counter;

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        Team t1 = new Team("Tigers");
        Team t2 = new Team("Eagles");
        Team t3 = new Team("Dolphins");
        Team t4 = new Team("Heroes");
        teams.add(t1);
        teams.add(t2);
        teams.add(t3);
        teams.add(t4);
        Scheduler s = new Scheduler();

        boolean continueloop = true;

        while (continueloop) {
            try {
                System.out.print("What is Today's Temperature(℃)? ");
                temp = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Bad temperature value");
                sc.next();
            }
            if (temp > 10 && temp <= 35) {
                s.makeSchedule(teams, games, temp);
                System.out.println("2 Games scheduled. (1 game for 2 teams)");
                counter = 0;
            } else if (temp > 36) {
                System.out.println("Too Hot, Can't play");
            } else if (counter == 2) {
                System.out.println("Too cold to play");
                System.out.println("Season is over\n");
                break;
            } else {
                System.out.println("Too cold to play");
                counter++;
            }
        }

        // Display Season Result
        System.out.println("###### Result ######");

        //Sort Teams
        ArrayList<Team> tempTeams = new ArrayList<>();
        for (int i = 0; i < teams.size(); i++) {
            tempTeams.add(teams.get(i));
        }
        for (Team i : teams) {
            tempTeams.remove(i.getId() - 1);
            tempTeams.add(i.getId() - 1, i);
        }
        teams = tempTeams;

        //Show team result
        for (int i = 0; i < teams.size(); i++) {
            teams.get(i).displayTeam(teams.get(i));
        }

        //Show game result
        for (int i = 0; i < games.size(); i++) {
            games.get(i).displayGame(games.get(i));
            if (i == games.size() - 1) {
                games.get(i).displayTempResult();
            }
        }
    }
}