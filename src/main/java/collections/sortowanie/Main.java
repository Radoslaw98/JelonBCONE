package collections.sortowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    //Wykonaj następujące polecenia:
    //przygotuj listę typu double z 5 liczbami. posortuj liczby malejąco przy pomocy metody sort
    //przygotuj listę nazw zwierząt (String) i posortuj listę alfabetycznie.
    // (wariant trudniejszy: posortuj listę według tego jak często w danej nazwie występuje litera 'a'.
    // jeśli tak samo często to dopiero wtedy alfabetycznie
    //Stwórz obiekt Person z polami String name i int age.
    // Przygotuj listę z 4 osobami. posortuj osoby rosnąco wg wieku i przy tym samym wieku alfabetycznie po imieniu.

    public static void main(String[] args) {

        List<Double> lista= new ArrayList<>(List.of(1.0, 2.0, 3.0, 4.0, 5.0));
        Collections.sort(lista,Collections.reverseOrder());

        System.out.println(lista);
        List<String> zwierzeta= new ArrayList<>(List.of("Pies","kot","ryba","kon"));
Collections.sort(zwierzeta,String.CASE_INSENSITIVE_ORDER);
//        zwierzeta.sort(Comparator.naturalOrder());
//        List<String> collect = zwierzeta.stream().map(s->s.toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println(zwierzeta);
    }
}
