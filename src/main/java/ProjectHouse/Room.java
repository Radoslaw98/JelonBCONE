package ProjectHouse;

import java.util.Arrays;

public class Room {


    private Bed bed;
    private Window[] windows;


    public Room(Bed bed, Window[] windows) {
        this.bed = bed;
        this.windows = windows;
    }

    public Room(Window[] windows) {
        this.windows = windows;
    }


    public Room() {
        this.bed = new Bed(5);
        this.windows = new Window[]{new Window(), new Window()};
    }


    public void cleanRoom() {
        this.bed.setCounterSinceLastChangedSheet(0);
        for (Window window : windows) {
            window.openWindow();
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

    public Window[] getWindows() {
        return windows;
    }

    public void setWindows(Window[] windows) {
        this.windows = windows;
    }
}



