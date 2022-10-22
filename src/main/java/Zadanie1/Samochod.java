package Zadanie1;

public class Samochod {


    private Marka marka;
    private int przebieg;
    private int przeglad;

    public Samochod(Marka marka, int przebieg){
        this.marka=marka;
        this.przebieg=przebieg;
        this.przeglad=20_000;

    }
    public  Samochod(){};

    public void display() {
        System.out.println("Marka: " + marka + " Przebieg: " + przebieg);
    }


    //Stwórz metodę przyjmującą odległość do przejechania i zwiększającą przebieg samochodu o tę odległość


public void distance(int distance) {
    przebieg += distance;
}


//Stwórz metodę zwracającą ilość kilometrów po których trzeba będzie wykonać przegląd (uwzględniając aktualny przebieg)

    public int kilometersToReview(){
       return  przeglad-przebieg;
    }



}
