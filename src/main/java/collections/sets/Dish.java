package collections.sets;

import java.util.Objects;

public class Dish {

    private String nazwa;
    private double cena;
    private double calories;
    private Typ typ;

    public Dish(String nazwa, double cena, double calories, Typ typ) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.calories = calories;
        this.typ = typ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Double.compare(dish.cena, cena) == 0 && Double.compare(dish.calories, calories) == 0 && Objects.equals(nazwa, dish.nazwa) && typ == dish.typ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena, calories, typ);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", calories=" + calories +
                ", typ=" + typ +
                '}';
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public Typ getTyp() {
        return typ;
    }

    public void setTyp(Typ typ) {
        this.typ = typ;
    }
}
