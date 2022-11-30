package abstract1;

public abstract  class  Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public void goToSleep(){
        System.out.println("Sleep");
    }

    public  abstract void makeSound();


}
