package soccergame;

public class Game {

    private int gameId;
    private int temp;
    private Team homeTeam;
    private Team awayTeam;
    private int homeGoal;
    private int awayGoal;
    private static int id;
    private static int totalGames;
    private static int sumTemp;
    private static int hottestTemp;
    private static double AverageTemp;

    public Game() {
        id++;
        gameId = id;
    }

    public void playGame(Team t1, Team t2, int temp) {
        totalGames++;
        this.temp = temp;
        if (temp > hottestTemp) {
            hottestTemp = temp;
        }
        sumTemp += temp;
        AverageTemp = sumTemp / (totalGames);

        //Game Match
        int goalLimit;
        goalLimit = temp / 5;
        homeTeam = t1;
        awayTeam = t2;
        homeGoal = (int) (Math.random() * goalLimit);
        awayGoal = (int) (Math.random() * goalLimit);
        t1.setTotalGoalScore(homeGoal);
        t1.setTotalGoalAllow(awayGoal);
        t2.setTotalGoalScore(awayGoal);
        t2.setTotalGoalAllow(homeGoal);

        if (homeGoal > awayGoal) {
            t1.setWinTotal(t1.getWinTotal() + 1);
            t2.setLossTotal(t2.getLossTotal() + 1);
        } else if (homeGoal == awayGoal) {
            t1.setTieTotal(t1.getTieTotal() + 1);
            t2.setTieTotal(t2.getTieTotal() + 1);
        } else {
            t1.setLossTotal(t1.getLossTotal() + 1);
            t2.setWinTotal(t2.getWinTotal() + 1);
        }
    }

    public void displayGame(Game g) {
        System.out.println("Game #" + g.gameId);
        System.out.println("Temperature: " + g.temp);
        System.out.println("Home Team: " + g.getHomeTeam().getId() + ", Goals: " + g.homeGoal);
        System.out.println("Away Team: " + g.getAwayTeam().getId() + ", Goals: " + g.awayGoal);
        System.out.println();
    }

    public void displayTempResult() {
        System.out.println("Hottest Temp: " + hottestTemp + "celcius ");
        System.out.println("Average Temp: " + AverageTemp + "celcius ");
    }

    public static int getGameId() {
        return id;
    }

    public static void setGameId(int gameId) {
        Game.id = gameId;
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
