package projectWorkshop;

public class Workshop {

    private final double CURRENT_PRICE_FOR_WHEEL_REPAIR = 50.0;

    public Bill repairWheel(Car car) {
        //Pobieram wszystkie koła z samochodu
        Wheel[] wheels = car.getWheels();

        //Tu przechowuję już naprawione koła
        Wheel[] repairedWheels = new Wheel[4];

        //Tu będę liczył ile kół naprawiłem
        int numberOfWheelsRepair = 0;

        // Iteruję się po wszystkich kołach i jeżeli jest dziurwa to tworzę nową z tym samym ciśnieniem co było ale już bez dziury
        // i dodatkowo liczę je do rachunku a jeżeli jest okej to ją zostawiam. Później ustawiam zreperowane koła do auta

        for (int i = 0; i < wheels.length; i++) {
            if (wheels[i].isPierced()) {
                repairedWheels[i] = new Wheel(wheels[i].getPressure(), false);
                numberOfWheelsRepair++;
            } else {
                repairedWheels[i] = wheels[i];
            }
        }
        car.setWheels(repairedWheels);

        return createBillForWheelRepairing(numberOfWheelsRepair);

    }

    //punkt 5
    private Bill createBillForWheelRepairing(int numberOfWheelsRepair) {
        double totalPrice = numberOfWheelsRepair * CURRENT_PRICE_FOR_WHEEL_REPAIR;
        return new Bill("Hole in the wheel", numberOfWheelsRepair, totalPrice);
    }
}
