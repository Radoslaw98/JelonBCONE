package enums;

public class Card {
    private Color color;
    private Rank rank;

    public Card(Color color, Rank rank) {
        this.color=color;
        this.rank=rank;

    }
public int  cardPower(){
        return rank.getPower();
}

    @Override
    public String toString() {
        return "Card{" +
                "color=" + color +
                ", rank=" + rank +
                '}';
    }
}
