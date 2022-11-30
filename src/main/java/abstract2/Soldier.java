package abstract2;

public class Soldier extends  Citizien{


    public Soldier(String name) {
        super(name);
    }

    public boolean canVote(){
        return true;
    }
}
