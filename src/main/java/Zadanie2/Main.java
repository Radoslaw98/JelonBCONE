package Zadanie2;

import Zadanie6.FabrykaLinii;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        Stwórz klasę Linia. Obiekty tej klasy powinny mieć dwie cechy:
        długość i wypełnienie. W metodzie main stwórz 3 obiekty linni i nadaj im różne długości i symbole wypełnienia.
        Następnie stwórz metodę void drukujLinie(), która ma drukować symbol ustawiony jako wypełnienie tyle razy,
        jaka jest ustawiona długość linii. np: przy ustawionej długości 6 i wypełnieniu "@" wydrukuje następującą linię:

@@@@@@

Przy długości 20 i  wypełnieniu "*" powinna wydrukować linię:

********************

wariant trudniejszy: stwórz klasę Prostokat, i nadaj mu cechy: wysokość, szerokość oraz wypełnienie.
W main przygotuj 2 obiekty tego typu i zdefinuj (zainicjalizuj) wartości w ich polach.
 Stwórz analogiczną metodę jak dla linni, która będzie drukować prostokąt wykorzystując informacje zawarte w jego cechach.

         */

Line  lineOne= new Line(5,"@");
//Line lineTwo= new Line(10,"!");
//Line lineThee= new Line(15,"*");
//
//lineOne.printLine();
//
//
//        Rectangle rectangleOne = new Rectangle(5, 10, "@");
//        Rectangle rectangleTwo = new Rectangle(4, 3, "*");
//
//        rectangleTwo.printRectangle();
//        System.out.println();
//        rectangleOne.printRectangle();
        FabrykaLinii linia= new FabrykaLinii();
//        Line line = linia.randomLongLine();
//        System.out.println(line);
//line.printLine();
//Line line2= linia.randomSign();
//        System.out.println(line2);
//        line2.printLine();
//
//        Line line1= linia.radomLineAndSign();
//        System.out.println(line1);
//        line1.printLine();

//List<Line> line3=linia.manyRandomLines(3);
//           for(Line lines: line3){
//                  lines.printLine();
//                   System.out.println();
//           }

           Line line5= linia.twiceTimelongerLine();
            System.out.println(line5);
line5.printLine();
            Line line6= linia.twiceTimelongerLine();
            System.out.println(line6);
            line6.printLine();
            Line line7= linia.twiceTimelongerLine();
            System.out.println(line7);
            line7.printLine();

    }
}
