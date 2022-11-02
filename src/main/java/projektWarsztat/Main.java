package projektWarsztat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    /*
    Projekt: Warsztat

Przygotuj program w którym zasymulujesz sytuację w której kierowca samoc hodu łapiegumę w kole i zabiera go do warsztatu do naprawy.

w main przygotuj 4 obiekty kół, każde z nich ma mieć ustawione ciśnienie i ma nie być przebite
zbierz wszystkie koła do zbioru i przekaż do obiektu typu Samochod
zasymuluj zdarzenie, że samochód łapie gumę w losowym kole
obiekt typu Warsztat może przyjmować samochód do naprawy
naprawa polega na tym, że warsztat wyszukuje które koło z samochodu jest zepsute i poprawia jego stan
na koniec naprawy warsztat zwraca obiekt typu Paragon zawierający rodzaj usługi, ile razy była wykonana oraz łączną cenę
     */

    public static void main(String[] args) {

Tire[] tires= new Tire[4];
        for (int i = 0; i < tires.length ; i++) {
            tires[i]= new Tire();
        }
        System.out.println(tires);

//        Set<Tire> tireSet= new HashSet<>();
//        tireSet.add(new Tire());
//        tireSet.add(new Tire());
//        tireSet.add(new Tire());
//        tireSet.add(new Tire());
//   System.out.println(tireSet);


  Car car= new Car(tires);
//        System.out.println(car);
car.carGetFlatRandomTire();
        System.out.println(car);

    }

}
