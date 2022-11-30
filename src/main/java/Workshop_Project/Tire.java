package Workshop_Project;

public class Tire {

    private double pressureOfTireInBars;
    public boolean isTireFlat;

    public Tire() {
        this.pressureOfTireInBars= 4.2;
        this.isTireFlat =false;

    }

    public void isFlat(){
        isTireFlat=true;
        System.out.println("tire is Flat");
    }


    @Override
    public String toString() {
        return "Tire{" +
                "pressureOfTireInBars=" + pressureOfTireInBars +
                ", isTireFlat=" + isTireFlat +
                '}';
    }

    public double getPressureOfTireInBars() {
        return pressureOfTireInBars;
    }

    public void setPressureOfTireInBars(double pressureOfTireInBars) {
        this.pressureOfTireInBars = pressureOfTireInBars;
    }

    public boolean isTireFlat() {
        return isTireFlat;
    }

    public void setTireFlat(boolean tireFlat) {
        isTireFlat = tireFlat;
    }


}
