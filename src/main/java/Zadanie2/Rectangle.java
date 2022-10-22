package Zadanie2;

public class Rectangle {

    private int high;
    private int width;
    private String fill;

    Rectangle(int high, int width, String fill){
        this.high=high;
        this.width=width;
        this.fill =fill;

    }
public void printRectangle(){
    for (int i = 0; i <width ; i++) {
        System.out.print(fill);
        }
    System.out.println();
    for (int j = 0; j < high ; j++) {
        System.out.print(fill);
        for (int i = 0; i < width-2; i++) {
            System.out.print(" ");
        }

        System.out.println(fill);
        }
    for (int i = 0; i <width ; i++) {
        System.out.print(fill);
    }


    }


    }





//    public String printRectangle() {
//        String rectangle="";
//        for (int i = 0; i <high; i++) {
//            rectangle+= fill;
//            for (int j = 0; j <width ; j++) {
//                rectangle+="\n";
//
//            }
//        }
//        return rectangle;
//    }

