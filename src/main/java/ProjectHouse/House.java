package ProjectHouse;

import java.util.Arrays;

public class House {

    private Room[] room;

    public House(Room[] room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "pokoj=" + Arrays.toString(room) +
                '}';
    }

    public Room[] getPokoj() {
        return room;
    }

    public void setPokoj(Room[] room) {
        this.room = room;
    }
}
