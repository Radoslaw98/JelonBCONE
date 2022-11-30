package interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        FamilyMember mother = new Mother("Ola");
        FamilyMember father = new Father("Bartek");
        FamilyMember daughter = new Daughter("Ala");
        FamilyMember son = new Son("Filip");

        List<FamilyMember> familyMembers = List.of(mother, father, daughter, son);

        familyMembers.stream().forEach(f -> {
            f.introduceYourself();
            System.out.println(f.iAmAdult());

        });


    }
}
