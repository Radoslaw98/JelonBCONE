package Zadanie2;

public class Line {

    private int lenght;
    private String fill;


 public Line(int lenght, String fill){
    this.lenght=lenght;
    this.fill=fill;
}


void printLine(){
    for (int i = 0; i <lenght ; i++) {
        System.out.print(fill);

    }

    }

    public Line(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Line{" +
                "lenght=" + lenght +
                ", fill='" + fill + '\'' +
                '}';
    }


}
