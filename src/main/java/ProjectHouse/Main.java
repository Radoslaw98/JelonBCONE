package ProjectHouse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {


        Window[] windows = new Window[4];
        for (int i = 0; i < windows.length; i++) {
            windows[i] = new Window();
            windows[i].openWindow();
        }

        Bed bed = new Bed(5);

        House house = new House(new Room[]{new Room(), new Room(new Window[]{new Window(), new Window(), new Window(), new Window()})});
        System.out.println(house);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(house);
        System.out.println(json);
    }


}
