package Zadanie1;

import java.util.Arrays;

public class SamochodDemo {
    /*
    Stwórz klasę typu Samochod oraz SamochodDemo z metodą main.
W metodzie main stwórz dwa obiekty typu samochód.
Obiekty typu Samochod mają mieć następujące cechy: marka, przebieg oraz przebieg do przeglądu, ta ostatnia uzupełniona jakąś wartością np 20 000 km.
W metodzie main nadaj wartości dla cech stworzonych wcześniej samochodów.

Dla obiektów typu Samochod przygotuj następujące zachowania oraz przetestuj je w main:

Stwórz metodę wyświetlającą markę samochodu oraz przebieg
Stwórz metodę przyjmującą odległość do przejechania i zwiększającą przebieg samochodu o tę odległość
Stwórz metodę zwracającą ilość kilometrów po których trzeba będzie wykonać przegląd (uwzględniając aktualny przebieg)

wariant trudniejszy: stwórz w main tablicę samochodów a następnie wykorzystując pętlę wyświetl dane każdego z nich

     */

    public static void main(String[] args) {

        Samochod samochod1 = new Samochod(Marka.BMW, 5_000);
        Samochod samochod2 = new Samochod(Marka.AUDI, 7_000);

        samochod1.display();
        samochod2.display();

        System.out.println();
        System.out.println("-------------");
        System.out.println();

        samochod1.distance(3_000);
        samochod2.distance(1_000);


        samochod1.display();
        samochod2.display();

        System.out.println();
        System.out.println("-------------");
        System.out.println();

        System.out.println(samochod1.kilometersToReview());
        System.out.println(samochod2.kilometersToReview());

        ////wariant trudniejszy: stwórz w main tablicę samochodów a następnie wykorzystując pętlę wyświetl dane każdego z nich


        Samochod[] carTab= new Samochod[2];
        carTab[0]=samochod1;
        carTab[1]=samochod2;

        for (int i = 0; i < carTab.length ; i++) {
            System.out.println(carTab[i]);

        }


        /*
        Wróć do zadania z klasami Linia oraz Samochod - dodaj do każdej z klas po dwa
        różne konstruktory i wykorzystaj je w mainie.
        W jednej z klas napisz konstruktory ręcznie a w drugiej wygeneruj.
         */

    }
}
