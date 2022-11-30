package abstract2;

public abstract class Citizien {

    private String name;


    public Citizien(String name) {
        this.name = name;
    }

    public abstract boolean canVote();

    public String getName() {
        return name;
    }
}
