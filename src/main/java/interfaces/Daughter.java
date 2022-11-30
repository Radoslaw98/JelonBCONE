package interfaces;

public class Daughter implements FamilyMember{
    private  String name;

    public Daughter(String name) {
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println("I am your daughter  "+name);
    }

    @Override
    public boolean iAmAdult() {
        return false;
    }
}
