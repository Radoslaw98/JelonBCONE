package ProjektDom;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {


        Okno[] windows = new Okno[4];
        for (int i = 0; i < windows.length; i++) {
            windows[i] = new Okno();
            windows[i].openWindow();
        }

        Bed bed = new Bed(5);

//Pokoj pokoj = new Pokoj();
//Pokoj pokoj2 = new Pokoj(new Okno[]{new Okno(),new Okno(),new Okno(),new Okno(),});

        Dom dom = new Dom(new Pokoj[]{new Pokoj(), new Pokoj(new Okno[]{new Okno(), new Okno(), new Okno(), new Okno()})});
        System.out.println(dom);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(dom);
        System.out.println(json);
    }


}
