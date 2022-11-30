package abstract1;

public class Cat  extends  Animals{


    public Cat(String name, int age) {
        super(name,age);

    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    public void drinkMilk(){
        System.out.println("Drink Milk");
    }


}
