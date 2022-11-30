package collections.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Restaurant {

    public Restaurant() {
        this.dishes = new HashSet<>();
    }

    private Set<Dish> dishes;



    public void addDish(Dish dish){
        dishes.add(dish);
    }
    public void removeDish(Dish dish){
        dishes.remove(dish);
    }

    public Dish returnDish(String nazwa){
        for(Dish dania: dishes){
            if(nazwa.equals(dania.getNazwa())){
                return dania;
            }
        }
         throw new RestaurantException();
    }

    public List<Dish> returnDishByType(Typ typ){
        List<Dish> newList= new ArrayList<>();
        for(Dish dania: dishes){
            if(typ.equals(dania.getTyp())){
                newList.add(dania);

            }
        }
       return newList;
    }



}
