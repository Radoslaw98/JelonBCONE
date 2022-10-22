package Zadanie6;

import Zadanie2.Line;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


/*
  /*
    DLA CHĘTNYCH:

Fabryka Linii
W programie z Liniami stwórz dodatkową klasę: FabrykaLinii, a w niej stwórz metody, wytwarzające i zwracające:
linię losowej długości z wybranym znakiem,
linię wybranej długości ale z losowym znakiem,
linię z losową długością i losowym znakiem
określoną ilość linni z losową długością i znakiem
(wykorzystaj wcześniejszą metodę)
linię z długością 2 i losowym znakiem ale każda kolejna zwrócona linia ma być 2x większa od poprzedniej
Następnie w klasie LinieDemo przetestuj wszystkie metody drukując wyprodukowane przez nie linie.

     */


public class FabrykaLinii  {

    private int zmienna =2 ;


    public Line randomLongLine(){
        Random random = new Random();
        int low = 10;
        int high = 100;
        int result = random.nextInt(high-low) + low;
     return  new Line (result,"%");
    }

    public Line randomSign(){

        Random random = new Random();

        char result= (char) random.nextInt(random.nextInt(33)+126);

        return  new Line (10, (String.valueOf(result)));
    }

    public Line radomLineAndSign(){
        Random random = new Random();
        char result= (char) random.nextInt(random.nextInt(33)+126);
        int low = 10;
        int high = 100;
        int result2 = random.nextInt(high-low) + low;
        return  new Line (result2, (String.valueOf(result)));

    }


    public List<Line> manyRandomLines(int numberOfLines){
        List<Line> randomLinesLIst= new ArrayList<>();
        for (int i = 0; i <numberOfLines ; i++) {
            randomLinesLIst.add(radomLineAndSign());
        }
        return  randomLinesLIst;
    }
/*
linię z długością 2 i losowym znakiem ale każda kolejna zwrócona linia ma być 2x większa od poprzedniej
 */
public Line twiceTimelongerLine(){
    Random random = new Random();
    char result= (char) random.nextInt(random.nextInt(33)+126);


    Line line = new Line(zmienna, (String.valueOf(result)));
zmienna=(zmienna*2);
return line;

}

}
