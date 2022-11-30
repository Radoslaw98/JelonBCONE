package abstract2;

public class King  extends  Citizien{

    public King(String name) {
        super(name);
    }

    @Override
    public boolean canVote(){
        return false;
    }


}
