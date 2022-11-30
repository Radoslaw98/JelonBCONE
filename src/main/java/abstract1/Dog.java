package abstract1;

public class Dog  extends  Animals{


    public Dog(String name, int age) {
        super(name,age);

    }

    @Override
    public void makeSound() {
        System.out.println("woof");
    }


public  void graveBone(){
    System.out.println("Grave bone");
}



}
