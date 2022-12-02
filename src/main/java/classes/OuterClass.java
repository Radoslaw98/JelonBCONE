package classes;

import java.util.ArrayList;
import java.util.List;

public class OuterClass {

    private String message = "Outer class";
    private static String staticMessage = "Outer class static";

    public static int sum(int x, int y) {
        return x + y;
    }

    public void printMessage() {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.message);
    }

    //1.Zwykła klasa wewnętrzna
    public class InnerClass {

        private String message = "Inner class";

        public void printMessage() {
            System.out.println(this.message);
        }
    }

    //2.lokalna klasa wewnętrzna - klasa zdefiniowana w ciele metody
    public void sayHello() {
        //metoda ta staje się domyślnie finalna
        String helloMessage = "Hello local class";

        class LocalClass {
            public void sayLocalHello() {
                System.out.println("Outer class message: " + message);
                System.out.println("Local class message: " + helloMessage);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.sayLocalHello();
    }

    // Klasa anonimowa - niemożliwe jest zainicjalizowanie interfejsu. Dlatego tworzymy na szybko potrzebną klasą umieszczając jej ciało między nawiasami klamrowymi
    //W klasach anonimowych można korzystać ze zmiennych klasy zewnętrznej o raz finalych zmiennych metody, w której zaimplentowno klasę anonimową.
    // Klasa anonimowa musi implementować wszystkie metody interfejsu. Może definiować też własne pola i metody

    //Od Javy 8 takie proste implementacje w postaci klas anonimowych straciły znaczenie, ponieważ mogą być zastępowane wyrażeniami lambda.

    Printer printer = new Printer() {
        @Override
        public void print(String message) {
            System.out.println(message);
        }
    };

    public void test() {
        String text = "klasa anonimowa";
        printer.print(message + " " + text);
    }


    //static - słowo kluczowe (keywords), używając static mówimy, że dana kalsa, metoda, pole nie należy do instancji klasy(czyli obiektu) tylko do klasy.
    //Static nested class - mają one dostep tylko do statycznych pól klasy zewnętrznej
    //Builder - przykład użycia
    static class StaticInnerClass {

        void printMessage() {
            System.out.println("Static class" + staticMessage);
        }
    }

}
