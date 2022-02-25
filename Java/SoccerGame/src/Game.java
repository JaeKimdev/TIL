public class Game {
    private int id = 0;
    private int temp;
    private Team homeTeam;
    private Team awayTeam;
    private int homeGoal;
    private int awayGoal;
    private int totalGames;
    private int sumTemp;
    private int hottestTemp;
    private double AverageTemp;
    private static int gameId;

    public Game() {
        id++;
        gameId = id;
    }

    public void playGame(Team t1, Team t2, int temp) {
        totalGames++;
        if (temp > hottestTemp) {
            hottestTemp = temp;
        }
        sumTemp += temp;
        AverageTemp = sumTemp / totalGames;

        int goalLimit;
        goalLimit = temp / 5;
        homeTeam = t1;
        awayTeam = t2;
        homeGoal = (int)(Math.random() * goalLimit);
        awayGoal = (int)(Math.random() * goalLimit);
        t1.setTotalGoalScore(homeGoal);
        t1.setTotalGoalAllow(awayGoal);
        t2.setTotalGoalScore(awayGoal);
        t2.setTotalGoalAllow(homeGoal);

        if (homeGoal > awayGoal) {
            t1.setWinTotal(1);
            t2.setLossTotal(1);
        }
        else if (homeGoal == awayGoal) {
            t1.setTieTotal(1);
            t2.setTieTotal(1);
        }
        else {
            t1.setLossTotal(1);
            t2.setWinTotal(1);
        }
    }

    public void displayGame(Game g) {
        System.out.println("Game #" + g.id);
        System.out.println("Temperature: " +g.temp);
        System.out.println("Home Team: " + g.homeTeam.getId() + ", Goals: " + g.homeGoal);
        System.out.println("Away Team: " + g.awayTeam.getId() + ", Goals: " + g.awayGoal);
        System.out.println();
    }

    public void displayTempResult() {
        System.out.println("Hottest Temp: " + hottestTemp + "℃");
        System.out.println("Avarage Temp: " + AverageTemp + "℃");
    }

    public static int getGameId() {
        return gameId;
    }

    public static void setGameId(int gameId) {
        Game.gameId = gameId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeGoal() {
        return homeGoal;
    }

    public void setHomeGoal(int homeGoal) {
        this.homeGoal = homeGoal;
    }

    public int getAwayGoal() {
        return awayGoal;
    }

    public void setAwayGoal(int awayGoal) {
        this.awayGoal = awayGoal;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }

    public int getSumTemp() {
        return sumTemp;
    }

    public void setSumTemp(int sumTemp) {
        this.sumTemp = sumTemp;
    }

    public int getHottestTemp() {
        return hottestTemp;
    }

    public void setHottestTemp(int hottestTemp) {
        this.hottestTemp = hottestTemp;
    }

    public double getAverageTemp() {
        return AverageTemp;
    }

    public void setAverageTemp(double averageTemp) {
        AverageTemp = averageTemp;
    }
}
