package abstract2;

public class Townsman extends  Citizien{

    public Townsman(String name) {
        super(name);
    }

    public boolean canVote(){
        return true;
    }
}
