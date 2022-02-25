import java.util.ArrayList;

public class SoccerGame {

    public static void main(String[] args) {

        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<Game> games = new ArrayList<>();

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
        try {
            s.checkTemp();
        } catch (Exception e) {
            System.out.println("Error! Please input valid temperature");
        }

        //call Schedule method

        // Display Season Result
        System.out.println("###### Result ######");

        //Show team result

        //Show game result

        //Show temp result

    }
}

