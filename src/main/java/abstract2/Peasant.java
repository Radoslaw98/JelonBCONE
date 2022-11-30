package abstract2;

public class Peasant extends  Citizien{

    public Peasant(String name) {
        super(name);
    }

    public boolean canVote(){
        return false;
    }
}
