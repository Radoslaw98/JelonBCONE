package Workshop_Project;

import java.util.*;

public class Car extends Tire {
//private boolean tires;
private Tire[] tires;

//    public Car(List<Tire> tires) {
//        this.tires = tires;
//    }
//public boolean carGetFlatInRandomTire(){
//        for ( Tire tires: tires){
//            Random random= new Random();
//            isTireFlat=random.nextBoolean();
//        }
//       return isTireFlat;




    public Car(Tire[] tires) {
        this.tires=tires;
    }


    public void carGetFlatRandomTire(){
        Random random= new Random();
      int randomTire=  random.nextInt(tires.length);
        tires[randomTire].setTireFlat(true);
    }

    @Override
    public String toString() {
        return "Car{" +
                "tires=" + Arrays.toString(tires) +
                '}';
    }
}




