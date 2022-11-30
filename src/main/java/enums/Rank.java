package enums;

public enum Rank {

    ACE(14),
    JACK(11),
    QUEEN(12),
    KING(13),
    JOKER(15);

    private int power;


    Rank(int power ) {
        this.power=power;

    }

    public int getPower() {
        return power;
    }
}
