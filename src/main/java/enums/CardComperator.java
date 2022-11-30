package enums;

public class CardComperator {

    public void compare(Card card, Card card2){

        if(card.cardPower()>card2.cardPower()){
            System.out.println(card);
        }
        else
            System.out.println(card2);
    }

}
