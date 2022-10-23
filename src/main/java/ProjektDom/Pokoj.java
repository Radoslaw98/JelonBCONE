package ProjektDom;

import java.util.Arrays;

public class Pokoj {


    private Bed bed;
    private Okno[] windows;


    public Pokoj(Bed bed, Okno[] windows) {
        this.bed = bed;
        this.windows = windows;
    }
    public Pokoj( Okno[] windows) {
        this.windows = windows;
    }

    /*
    Tworząc pokój drugim sposobem w pokoju ma stworzyć się tablica z 2 oknami oraz łóżko nie przebierane od 5 dni

     */
    public Pokoj() {
        this.bed = new Bed(5);
        this.windows = new Okno[]{new Okno(), new Okno()};
        }


        public void cleanRoom(){
        this.bed.setCounterSinceLastChangedSheet(0);
        for(Okno okno: windows){
            okno.openWindow();
        }

        }

    @Override
    public String toString() {
        return "Pokoj{" +
                "bed=" + bed +
                ", windows=" + Arrays.toString(windows) +
                '}';
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Okno[] getWindows() {
        return windows;
    }

    public void setWindows(Okno[] windows) {
        this.windows = windows;
    }
}



