public class Terminal {

    Prize p1 = new Prize("Hat", 5, 3);
    Prize p2 = new Prize("Candy", 3, 2);
    Prize p3 = new Prize("Glasses", 10, 3);

    public void addCredits(Card c, int cost) {
        System.out.println("## Add Credit ##");
        c.setCredits(c.getCredits() + cost * 2);
        System.out.println("Card " + c.getCardNum() + " have " + c.getCredits() + " Credits");
    }

    public void transferCredits(Card c1, Card c2) {
        System.out.println("## transfer Credits ##");
        c2.setCredits(c1.getCredits() + c2.getCredits());
        System.out.println("Transferred " + c1.getCredits() + " credits from Card #" + c1.getCardNum() + " to Card #" + c2.getCardNum());
        System.out.println("Card #" + c2.getCardNum() + " Credits Total: " + c2.getCredits());
        c1.setCredits(0);
    }

    public void transferTickets(Card c1, Card c2) {
        System.out.println("## transfer Tickets ##");
        c2.setTickets(c1.getTickets() + c2.getTickets());
        System.out.println("Transferred " + c1.getTickets() + " tickets from Card #" + c1.getCardNum() + " to Card #" + c2.getCardNum());
        System.out.println("Card #" + c2.getCardNum() + " Tickets Total: " + c2.getTickets());
        c1.setTickets(0);
    }

    public void requestPrize(String name, Card c) {
        System.out.println("## request Prize ##");
        if (name == p1.getName()) {
            if (p1.getNumOfPrize() > 0) {
                if (p1.getTicketReq() < c.getTickets()) {
                    System.out.println("You got a " + p1.getName() + "!");
                    c.setTickets(c.getTickets() - p1.getTicketReq());
                    p1.setNumOfPrize(p1.getNumOfPrize() - 1);
                    System.out.println("Remaining " + p1.getName() + ": " + p1.getNumOfPrize());
                    System.out.println("Card #" + c.getCardNum() +" remaining " + c.getTickets() + " tickets.");
                } else {
                    System.out.println("Not enough Tickets.");
                    System.out.println(name + " requires " + p1.getTicketReq() + " tickets. You only have " + c.getTickets() + " tickets.");
                }
            } else {
                System.out.println("This prize is SOLD OUT. choose another one!");
            }
        }
        if (name == p2.getName()) {
            if (p2.getNumOfPrize() > 0) {
                if (p2.getTicketReq() < c.getTickets()) {
                    System.out.println("You got a " + p2.getName() + "!");
                    c.setTickets(c.getTickets() - p2.getTicketReq());
                    p2.setNumOfPrize(p2.getNumOfPrize() - 1);
                    System.out.println("Remaining " + p2.getName() + ": " + p2.getNumOfPrize());
                    System.out.println("Card #" + c.getCardNum() +" remaining " + c.getTickets() + " tickets.");
                } else {
                    System.out.println("Not enough Tickets.");
                    System.out.println(name + " requires " + p2.getTicketReq() + " tickets. You only have " + c.getTickets() + " tickets.");
                }
            } else {
                System.out.println("This prize is SOLD OUT. choose another one!");
            }
        }
        if (name == p3.getName()) {
            if (p3.getNumOfPrize() > 0) {
                if (p3.getTicketReq() < c.getTickets()) {
                    System.out.println("You got a " + p3.getName() + "!");
                    c.setTickets(c.getTickets() - p3.getTicketReq());
                    p3.setNumOfPrize(p3.getNumOfPrize() - 1);
                    System.out.println("Remaining " + p3.getName() + ": " + p3.getNumOfPrize());
                    System.out.println("Card #" + c.getCardNum() +" remaining " + c.getTickets() + " tickets.");
                } else {
                    System.out.println("Not enough Tickets.");
                    System.out.println(name + " requires " + p3.getTicketReq() + " tickets. You only have " + c.getTickets() + " tickets.");
                }
            } else {
                System.out.println("This prize is SOLD OUT. choose another one!");
            }
        }
    }
}