public class Card {
    private int cardNum;
    private int credits;
    private int tickets;
    private static int numberGenerator = 0;

    public Card() {
        numberGenerator++;
        cardNum = numberGenerator;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

}