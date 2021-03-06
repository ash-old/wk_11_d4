import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }


    public String getName() {
        return this.name;
    }

    public int handSize() {
        return this.hand.size();
    }

    public ArrayList<Card> getPlayerHand() {
        return hand;
    }

    public void takeCard(Card card) {
        this.hand.add(card);
    }

    public int handTotal() {
        int total = 0;
        for(Card card : this.hand){
            total += card.getValue();
        }
        return total;
    }
}
