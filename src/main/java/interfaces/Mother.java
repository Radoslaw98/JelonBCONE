package interfaces;

public class Mother implements  FamilyMember{

    private  String name;

    public Mother(String name) {
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println("I am your Mother "+name);

    }

    @Override
    public boolean iAmAdult() {
        return true;
    }


}
