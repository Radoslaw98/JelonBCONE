package strimy;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Person {
    private  String name;
    private LocalDate birthday;
    private List<Pet> pets;


    public Person(String name, LocalDate birthday, List<Pet> pets) {
        this.name = name;
        this.birthday = birthday;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", pets=" + pets +
                '}';
    }

    public int returnAgeOfPerson(){
        return Period.between(birthday, LocalDate.now()).getYears();




    }
}
