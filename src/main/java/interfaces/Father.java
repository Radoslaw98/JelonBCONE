package interfaces;

public class Father implements  FamilyMember{

    private  String name;

    public Father(String name) {
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println("I am your Father "+name);
    }

    @Override
    public boolean iAmAdult() {
        return true;
    }
}
