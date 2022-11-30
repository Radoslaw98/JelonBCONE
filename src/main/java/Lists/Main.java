package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {



    List<String > names= new ArrayList<>();

    names.add("Radek");
    names.add("Kuba");
    names.add("bartek");
    names.add("Tomek");
    names.add("Ola");

        System.out.println(names.get(0));
        names.set(1,"Julia");
        System.out.println(names);
        names.remove("bartek");
        System.out.println(names);

List<String > names2= new ArrayList<>();
        names2.add("Oliwia");
        names2.add("Nikola");
names2.addAll(names);
        System.out.println(names2);

        List<String> collect = names2.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
        List<String> collect1 = names2.stream().filter(a -> a.charAt(a.length() - 1) == 'a').collect(Collectors.toList());
        System.out.println(collect1);


    }
}
