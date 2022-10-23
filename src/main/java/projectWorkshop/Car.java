package projectWorkshop;

import java.util.Arrays;
import java.util.Random;

public class Car {

    private Wheel[] wheels;

    public Car(Wheel[] wheels) {
        this.wheels = wheels;
    }

    //punkt 3 - w tym przypadku perwsza z opon łapie gumę (można zrobić losową)
    public void catchAFlatInRandomWheel() {
        Random random = new Random();
        int randomWheel = random.nextInt(4);
        this.wheels[randomWheel].catchAFlat();
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + Arrays.toString(wheels) +
                '}';
    }
}
