package projectWorkshop;

public class Bill {

    private String typeOfService;

    private int times;

    private double totalValue;

    public Bill(String typeOfService, int times, double totalValue) {
        this.typeOfService = typeOfService;
        this.times = times;
        this.totalValue = totalValue;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "typeOfService='" + typeOfService + '\'' +
                ", times=" + times +
                ", totalValue=" + totalValue +
                '}';
    }
}
