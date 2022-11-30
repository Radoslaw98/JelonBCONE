package enums;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Card card = new Card(Color.DIAMOND, Rank.JACK);
        Card card2 = new Card(Color.HEART, Rank.ACE);

        System.out.println(card);
        System.out.println(card2);


        System.out.println(Arrays.toString(Color.values()));
        System.out.println(Arrays.toString(Rank.values()));
        CardComperator cardComperator = new CardComperator();
        cardComperator.compare(card, card2);

        Main.displayAllSpades();
        Main.displayAllCards();


    }

    public static void displayAllSpades() {
        List<Card> cardList = new ArrayList<>();

        for (Color color : Color.values()) {
            for (Rank ranks : Rank.values()) {
                if (color == Color.SPADE) {
                    Card card = new Card(color, ranks);
                    cardList.add(card);

                }
            }
            System.out.println(cardList);
        }
    }
    public static void displayAllCards() {
        List<Card> cardList = new ArrayList<>();

        for (Color color : Color.values()) {
            for (Rank ranks : Rank.values()) {

                    Card card = new Card(color, ranks);
                    cardList.add(card);

                }
            }
            System.out.println(cardList);
        }
    }

