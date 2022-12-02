package strimy;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        //Przygotuj ArrayList z 10 liczbami z przedziału 0-100.
        //za pomocą metody forEach wyświetl wszystkie liczby
        //za pomocą streama posortuj liczby i wyświetl posortowane
        //za pomocą streama odfiltruj liczby nieparzyste i policz ile pozostało elementów funkcją kończącą count()
        //za pomocą streama odfiltruj wszystkie liczby powyżej 50, pozostałe liczby zbierz do nowej listy
        //za pomocą streama posortuj liczby malejąco a następnie pobierz pierwszą z nich metodą findFirst

//
//        List<Integer> liczby= new ArrayList<>();
//        Random random= new Random();
//        for(int i =0; i<10; i++) {
//            liczby.add(random.nextInt(100));
//        }
//
//        System.out.println(liczby);
//
//       liczby.stream().forEach( liczba-> System.out.print(liczba+" "));
//        System.out.println();
//       liczby.stream().sorted().forEach(licza-> System.out.print(licza+" "));
//        System.out.println();
//       liczby.stream().filter(a->a%2==0).forEach(a-> System.out.print(a+" "));
//        System.out.println();
//        long count = liczby.stream().filter(a -> a % 2 == 0).count();
//        System.out.println(count);
//        System.out.println();
//        List<Integer> collect = liczby.stream().filter(a -> a > 50).collect(Collectors.toList());
//        System.out.println(collect);
//        System.out.println();
//        Optional<Integer> first = liczby.stream().sorted(Comparator.reverseOrder()).findFirst();
//        System.out.println(first.get());


        Pet dog = new Pet("Rex", 1);
        Pet cat = new Pet("Cia", 3);
        Pet fish = new Pet("Noname", 5);
        Pet dog2 = new Pet("Sen", 8);

        Person tom = new Person("Tomek", LocalDate.of(1995, 3, 22), List.of(dog, cat, fish));
        Person ola = new Person("Ola", LocalDate.of(1998, 9, 23), List.of(dog2));
        Person bartek = new Person("Bartek", LocalDate.of(2000, 5, 3), List.of());

        List<Person> people = Arrays.asList(tom, ola, bartek);
        System.out.println();
        List<String> collect = people.stream().map(Person::getName).sorted().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println();
        List<Integer> collect1 = people.stream().map(Person::getBirthday).map(b -> b.getMonth().getValue()).sorted().collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println();
        long count = people.stream().map(p -> p.getPets()).flatMap(Collection::stream).count();
        System.out.println(count);
        System.out.println();
        long count1 = people.stream().map(Person::getPets).flatMap(Collection::stream).map(Pet::getAge).mapToInt(Integer::intValue).sum();
        System.out.println(count1);
        System.out.println(
        );
        System.out.println(bartek.returnAgeOfPerson());
        System.out.println();
        OptionalDouble average = people.stream().map(Person::returnAgeOfPerson).mapToInt(Integer::intValue).average();
        System.out.println(average.getAsDouble());
        System.out.println();
        System.out.println(Math.round(average.getAsDouble()));

    }
}
