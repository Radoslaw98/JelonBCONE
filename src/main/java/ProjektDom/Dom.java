package ProjektDom;

import java.util.Arrays;

public class Dom {

private  Pokoj[] pokoj;

    public Dom(Pokoj[] pokoj) {
        this.pokoj = pokoj;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "pokoj=" + Arrays.toString(pokoj) +
                '}';
    }

    public Pokoj[] getPokoj() {
        return pokoj;
    }

    public void setPokoj(Pokoj[] pokoj) {
        this.pokoj = pokoj;
    }
}
