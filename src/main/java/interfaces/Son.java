package interfaces;

public class Son implements FamilyMember{

    private  String name;

    public Son(String name) {
        this.name = name;
    }



    @Override
    public boolean iAmAdult() {
        return false;
    }
}
