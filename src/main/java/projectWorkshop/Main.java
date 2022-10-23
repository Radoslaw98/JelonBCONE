package projectWorkshop;

public class Main {
    public static void main(String[] args) {
        //punkt 1
        Wheel wheel1 = new Wheel(2.0, false);
        Wheel wheel2 = new Wheel(2.2, false);
        Wheel wheel3 = new Wheel(2.5, false);
        Wheel wheel4 = new Wheel(2.8, false);

        Wheel[] wheels = new Wheel[]{wheel1, wheel2, wheel3, wheel4};

        //punkt 2
        Car car = new Car(wheels);

        //punkt 3 - losowo dziurawie koła więc może się zdażyć, ze 3 razy trafię na to samo
        car.catchAFlatInRandomWheel();
        car.catchAFlatInRandomWheel();
        car.catchAFlatInRandomWheel();

        //Wypisz samochód z dziurami
        System.out.println(car);
        //punkt 4 + punkt 5
        Workshop workshop = new Workshop();
        Bill bill = workshop.repairWheel(car);

        // Wypisz samochód po naprawie
        System.out.println(car);

        //Wypisz rachunek
        System.out.println(bill);
    }
}
