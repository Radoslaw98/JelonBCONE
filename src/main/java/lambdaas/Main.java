package lambdaas;

import java.awt.*;
import java.security.PrivilegedAction;
import java.util.Comparator;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

Operation dodawanie= new Operation() {
    @Override
    public int counts(int jeden, int dwa) {
        System.out.println(jeden+dwa);
        return jeden+dwa;
    }
};


        Operation odejmowanie =(jeden,dwa)-> {
            System.out.println(jeden- dwa);
            return jeden-dwa;
        };


        odejmowanie.counts(2,3);
        dodawanie.counts(2,3);




Printer printer1= (x)-> System.out.println(x.toUpperCase()+"!");
printer1.print("Lalala");
//Ala ma kota =  Amk
Printer printer2= (x)->{
    String[] s = x.split(" ");
    String result= "";
    for(int i=0; i< s.length; i++){
        result+=s[i].charAt(0);
    }
    System.out.println(result);

};

printer2.print("Raz Dwa Trzy");

//Wykorzystując już instniejące interfejsy funkcyjne takie jak:
// Function, Consumer, Supplier, Predicate, Comparator zaimplementuj funkcję pozwalającą:
//wygenerować losową liczbę od 1 do 10
//sprawdzić czy hasło ma minimum 5 znaków
//prównującą dwa Stringi po długości (trudne)

        IntSupplier randomNumber = () -> {
            Random random = new Random();
            return random.nextInt(10);
        };
        System.out.println(randomNumber.getAsInt());
        Predicate passwordValidator = (haslo) -> {
            String a = haslo.toString();
            if (a.length() >= 5) {
                return true;
            }
            return false;
        };

//
//        a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
      Comparator comapare=  (jeden,drugi)->{
            String b= jeden.toString();
            String c= drugi.toString();

            if(b.length()==c.length()){
                return 0;
            }if(b.length()>c.length()){
                return 1;
            }
           return -1;
        };
comapare.compare("lala","lalala");

    }
}
