package abstract1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Animals cat= new Cat("Buree",5);
        Animals dog= new Dog("Alek",6);
        Cat cat1= new Cat("Kot",2);
        Dog dog1 = new Dog("Reksio",1);



        List<Animals> animalsList= new ArrayList<>();
        animalsList.add(cat);
        animalsList.add(dog);

        for(Animals animals1: animalsList){
            animals1.goToSleep();
        }
        for(Animals animals1: animalsList){
            animals1.makeSound();
        }

cat.makeSound();
dog.makeSound();
cat1.makeSound();
dog1.makeSound();



    }
}
