package abstract2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

Citizien king = new King("Jarek");
Citizien peasant = new Peasant("Olek");
Citizien soldier = new Soldier("Dareek");
Citizien townsman = new Townsman("Ola");

        Town town=new Town();
        town.setCitizien(List.of(king, peasant, soldier, townsman));
        System.out.println(town.howManyCanVote());
        town.whoCanVote();
    }


}
