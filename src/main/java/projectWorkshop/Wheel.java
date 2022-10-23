package projectWorkshop;

public class Wheel {

    private double pressure;

    private boolean isPierced;

    public Wheel(double pressure, boolean isPierced) {
        this.pressure = pressure;
        this.isPierced = isPierced;
    }

    public void catchAFlat() {
        this.isPierced = true;
    }

    public boolean isPierced() {
        return isPierced;
    }

    public void setPierced(boolean pierced) {
        isPierced = pierced;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "pressure=" + pressure +
                ", isPierced=" + isPierced +
                '}';
    }
}
