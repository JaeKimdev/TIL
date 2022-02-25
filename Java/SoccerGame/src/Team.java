public class Team {
    private int id = 0;
    private String name;
    private int winTotal;
    private int lossTotal;
    private int tieTotal;
    private int totalGoalScore;
    private int totalGoalAllow;
    private static int teamNum;

    public Team (String name) {
        teamNum++;
        id = teamNum;
    }

    public void displayTeam(Team t) {
        System.out.println("Team " + t.id + name);
        System.out.println("Wins: " + t.winTotal +", Losses: "
                + t.lossTotal + ", Ties: " + t.tieTotal);
        System.out.println("Points Scored: " + t.totalGoalScore
                + ", Point Allowed: " + totalGoalAllow);
        System.out.println();
    }

    public static int getTeamNum() {
        return teamNum;
    }

    public static void setTeamNum(int teamNum) {
        Team.teamNum = teamNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWinTotal() {
        return winTotal;
    }

    public void setWinTotal(int winTotal) {
        this.winTotal = winTotal;
    }

    public int getLossTotal() {
        return lossTotal;
    }

    public void setLossTotal(int lossTotal) {
        this.lossTotal = lossTotal;
    }

    public int getTieTotal() {
        return tieTotal;
    }

    public void setTieTotal(int tieTotal) {
        this.tieTotal = tieTotal;
    }

    public int getTotalGoalScore() {
        return totalGoalScore;
    }

    public void setTotalGoalScore(int totalGoalScore) {
        this.totalGoalScore = totalGoalScore;
    }

    public int getTotalGoalAllow() {
        return totalGoalAllow;
    }

    public void setTotalGoalAllow(int totalGoalAllow) {
        this.totalGoalAllow = totalGoalAllow;
    }
}
