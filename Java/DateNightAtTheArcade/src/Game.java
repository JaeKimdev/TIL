public class Game {
    private String name;
    private int cost;

    public Game() {
        this("Super Funny Game", 1);
    }

    public Game(int cost) {
        this("Win Random Game", cost);
    }

    public Game(String name, int cost) {
        this.setName(name);
        this.setCost(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void play(Card c) {
        int tempCredit;
        int randomTicket;

        if (c.getCredits() - cost < 0) {
            System.out.println("Not Enough Credits, Please put more credits!");
        } else {
            System.out.println("Card # " + c.getCardNum());
            randomTicket = (int) (Math.random() * 10);
            System.out.println(randomTicket + " tickets Won!");
            c.setTickets(c.getTickets() + randomTicket);
            System.out.println(c.getTickets() + " tickets Total!");
            tempCredit = c.getCredits() - cost;
            c.setCredits(tempCredit);
            System.out.println("Credits Remain: " + c.getCredits());
        }
    }
}