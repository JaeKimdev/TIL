import java.util.ArrayList;
import java.util.Scanner;

public class SoccerGame {

    public static void main(String[] args) {

        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<Game> games = new ArrayList<>();
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

        //check Weather
        int temp;
        System.out.print("What is Today's Temperature(℃)? ");
        temp = sc.nextInt();

        if  (temp > 5)

        //call Schedule method

        s.makeSchedule(teams, games, temp);

        // Display Season Result
        System.out.println("###### Result ######");

        //Show team result

        //Show game result

        //Show temp result


    }
}

