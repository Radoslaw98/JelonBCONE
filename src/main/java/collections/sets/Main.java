package collections.sets;

import Workshop_Project.Receipt;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.HashSet;
import java.util.Set;

public class Main {

    //Wykonaj następujące polecenia:
    //Stwórz zbiór nazw potraw i uzupełnij 5 potrawami.
    //Spróbuj dodać potrawę która znajduje się już w zbiorze
    //Spróbuj wyświetlić pierwszą potrawę w zbiorze - da się?
    //Przeiteruj się po wszystkich elementach zbioru wyświetlając potrawy dużymi literami

    public static void main(String[] args) {

//        Set<String> potrawy= new HashSet<>();
//        potrawy.add("rosol");
//        potrawy.add("pizza");
//        potrawy.add("piegoi");
//        potrawy.add("barszcz");
//        potrawy.add("bigos");
//        potrawy.add("bigos");
//
//        System.out.println(potrawy);
//
//        System.out.println(potrawy.contains("rosol"));
//
//        for(String potrawa : potrawy){
//            System.out.println(potrawa.toUpperCase());
//        }
//        System.out.println();
//        potrawy.stream().map(p->p.toUpperCase()).forEach(p-> System.out.println());












        //Stwórz obiekt Dish (potrawa), potrawa ma posiadać nazwę, cenę, wartość kaloryczną oraz enum - typ (np. BREAKFAST, DINNER, APPETIZER).
        //
        //	Uwaga, żadna z poniższych metod nie powinna drukować nic w konsoli. Wykorzystaj metody toString oraz wartości zwracane lub obsługę wyjątków :)
        //
        //stwórz klasę Restaurant, zawierającą zbiór dań
        //stwórz metody pozwalającą dodać danie i usunąć
        //dodaj do restauracji 5 różnych dań
        //zaimplementuj metody equals i hashCode aby uniknąć duplikatów i upewnij się, że spełniają swoje zadanie
        //stwórz metodę pozwalającą wyszukać danie po nazwie, ma ona zwracać obiekt typu Dish, w przypadku nie odnalezienia takiego obiektu obiektu ma rzucać wyjątek typu RestaurantException
        //stwórz metodę pozwalającą wyszukać dania po typie potrawy, jeśli nie ma żadnej potrawy w danym typie, metoda ma zwracać pustą listę.

        Restaurant restaurant= new Restaurant();
        restaurant.addDish(new Dish("Bigos", 5.50, 800, Typ.APPETIZER));
        restaurant.addDish(new Dish("Barszcz", 5.50, 800, Typ.APPETIZER));
        restaurant.addDish(new Dish("Puierogi", 5.50, 800, Typ.APPETIZER));
        restaurant.addDish(new Dish("Salatka", 5.50, 800, Typ.APPETIZER));
        restaurant.addDish(new Dish("Schavbowy", 5.50, 800, Typ.APPETIZER));
        restaurant.addDish(new Dish("Schavbowy", 5.50, 800, Typ.APPETIZER));
//        Dish dish=new Dish("Schavbowy", 5.50, 800, Typ.APPETIZER);
//        Dish dish1=new Dish("Schavbowy", 5.50, 800, Typ.APPETIZER);

        System.out.println(restaurant.returnDish("Salatka"));
//        System.out.println(restaurant.returnDish("asads"));
        System.out.println(restaurant.returnDishByType(Typ.BREAKFAST));
    }
}
