package postOffice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Package {

    private final String sender;

    private final String receiver;

    private final double weight;

    private final boolean isPrioritize;

    private final Status status;

    private List<String> names = new ArrayList<>();

    public Package(String sender, String receiver, double weight, Status status) {
        this.status = status;
        if (sender == null || sender.isEmpty() || receiver == null || receiver.isEmpty()) {
            throw new NoSenderOrReceiverException("No sender or receiver given");
        }
        if (weight < 1 || weight > 100000) {
            throw new WrongPackageWeightException("Wrong weight: " + weight);
        }
        this.sender = sender;
        this.receiver = receiver;
        this.weight = weight;
        this.isPrioritize = false;
    }

    public Package() {
        names.addAll(List.of("Tomek", "Kuba", "Jacek", "Ania", "Weronika"));
        Random random = new Random();

        this.sender = names.get(random.nextInt(names.size()));
        this.receiver = names.get(random.nextInt(names.size()));
        this.weight = random.nextDouble(5000.0) + 1;
        this.isPrioritize = random.nextBoolean();
        this.status = Status.CREATED;
    }

    public double countPackagePrice() {
        if (weight <= 500.0) {
            int standardPrice = 5;
            return standardPrice + addPriority(standardPrice);
        }
        if (weight <= 1000.0) {
            int standardPrice = 8;
            return standardPrice + addPriority(standardPrice);
        }
        if (weight <= 2000) {
            int standardPrice = 12;
            return standardPrice + addPriority(standardPrice);
        }
        double standardPrice = 12 + (weight - 2000) / 1000;
        return standardPrice + addPriority(standardPrice);
    }

    private double addPriority(double price) {
        return isPrioritize ? price + 0.1 * price : 0;
    }


    @Override
    public String toString() {
        return "Package{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", weight=" + weight +
                ", isPrioritize=" + isPrioritize +
                '}';
    }
}
