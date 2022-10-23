package ProjektDom;

public class Bed {

    private    int counterSinceLastChangedSheet;


    public Bed(int counterSinceLastChangedSheet) {
        this.counterSinceLastChangedSheet = counterSinceLastChangedSheet;
    }

    public int getCounterSinceLastChangedSheet() {
        return counterSinceLastChangedSheet;
    }

    public void setCounterSinceLastChangedSheet(int counterSinceLastChangedSheet) {
        this.counterSinceLastChangedSheet = counterSinceLastChangedSheet;
    }


    @Override
    public String toString() {
        return "Bed{" +
                "counterSinceLastChangedSheet=" + counterSinceLastChangedSheet +
                '}';
    }
}
