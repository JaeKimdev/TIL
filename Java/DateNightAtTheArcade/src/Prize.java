public class Prize {
    private String name;
    private int ticketReq;
    private int numOfPrize;

    public Prize() {
        this("Prize", 5, 3);
    }
    public Prize(String name) {
        this(name, 5, 3);
    }
    public Prize(String name, int ticketReq) {
        this(name, ticketReq, 3);
    }
    public Prize (String name, int ticketReq, int numOfPrize) {
        this.setName(name);
        this.setTicketReq(ticketReq);
        this.setNumOfPrize(numOfPrize);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicketReq() {
        return ticketReq;
    }

    public void setTicketReq(int ticketReq) {
        this.ticketReq = ticketReq;
    }

    public int getNumOfPrize() {
        return numOfPrize;
    }

    public void setNumOfPrize(int numOfPrize) {
        this.numOfPrize = numOfPrize;
    }
}
