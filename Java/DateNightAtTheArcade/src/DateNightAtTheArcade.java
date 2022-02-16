public class DateNightAtTheArcade {
    public static void main(String[] args) {
        Card card1 = new Card(); // A card created with a unique id (1)
        Card card2 = new Card(); // Another card created with a unique id (2)
        Game game1 = new Game(5); // A playable game which costs 5 credits per play
        Game game2 = new Game(7); // Another playable game which costs 7 credits per play Terminal terminal1 = new Terminal(); // A terminal created
        Terminal terminal1 = new Terminal(); // A terminal created
        Terminal terminal2 = new Terminal(); // Another terminal created
        terminal1.addCredits(card1, 20); // add 40 credits with $20 into card1
        terminal1.addCredits(card2, 20); // add 40 credits with $20 into card2


        System.out.println("\n\n>>> Card #1 is used to play Game #1 5 times...");

        for (int i = 0; i < 5; i++) {
            game1.play(card1); // play game1 5 times with card1
        }

        System.out.println("\n\n>>> Card #2 is used to play Game #2 5 times...");

        for (int i = 0; i < 5; i++) {
            game2.play(card2); // play game1 5 times with card2
        }

        System.out.println("\n\n>>> Credits & Tickets will be transferred from Card #1 to Car #2...");
        terminal1.transferCredits(card1, card2); // transfer credrits from card1 to card2
        terminal1.transferTickets(card1, card2); // transfer tickets from card1 to card2

        System.out.println("\n\n>>> Request prize Candy with Card #2...");
        terminal1.requestPrize("Candy", card2); // request Candy with card2. may or may not be claimed.

        System.out.println("\n\n>>> Card #1 is used to play Game #1 one more time...");
        game1.play(card1); // try to play game1 again with card1

        System.out.println("\n\n>>> Request different prizes with Card #1 and Card #2...");
        // request prize (Candy, Hat or Classes) with card1 or card 2.
        // prize may be claimed with enough tickets or may not if not enough tickets terminal1.requestPrize("Candy", card1);
        terminal1.requestPrize("Hat", card2);
        terminal1.requestPrize("Candy", card2);
        terminal1.requestPrize("Glasses", card2);
        terminal1.requestPrize("Candy", card2);
        terminal1.requestPrize("Candy", card2);
    }
}