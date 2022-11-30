package ProjectHouse.PostOfficeProject;

import java.util.*;

public class Package {

    private Status status;

    private final String sender;
    private final String receiver;
    private final double weightInGrams;
    private  boolean isPackagePriority;
    List<String> names = new ArrayList<>();


    public Package(String sender, String receiver, double weightInGrams)   {
        if (sender == null)
            throw new NoSenderOrReceiverException("No Sender  given");
        if (receiver == null)
            throw new NoSenderOrReceiverException("No receiver given");

        if (weightInGrams < 0 || weightInGrams > 100_000)
            throw new WeightIsOutOfScopeException("Weight is out of Scope");

        this.sender = sender;
        this.receiver = receiver;


        this.weightInGrams = weightInGrams;
        this.isPackagePriority = false;
this.status=Status.CREATED;

    }

    public Package() {
        Random random = new Random();

        names.add("Janek");
        names.add("Ola");
        names.add("Kuba");
        names.add("Jola");
        names.add("Bartek");

        this.status = Status.CREATED;
        this.sender = names.get(random.nextInt(names.size()));
        this.receiver = names.get(random.nextInt(names.size()));
        this.weightInGrams = random.nextInt((100_000) + 1);
        this.isPackagePriority = random.nextBoolean();
    }

    public double priceDependsFromWeightOfpackage() {
        if (weightInGrams < 500)
            return isPackagePriority ? (5 + 0.5) : 5;
        if (weightInGrams < 1000)
            return isPackagePriority ? (8 + 0.8) : 8;
        if (weightInGrams < 2000)
            return isPackagePriority ? (12 + 1.2) : 8;

        return isPackagePriorityPrice();
        // return isPackagePriority?((12+(weightInGrams-2000)/1000)+(12+(weightInGrams-2000)/1000)*0.1):12+(weightInGrams-2000)/1000;
//12+(weightInGrams-2000)/1000
    }

    public double isPackagePriorityPrice() {
        return isPackagePriority
                ? ((12 + (weightInGrams - 2000) / 1000)
                + (12 + (weightInGrams - 2000) / 1000) * 0.1)
                : 12 + (weightInGrams - 2000) / 1000;
    }


    public void setPackagePriority(boolean packagePriority) {
        isPackagePriority = packagePriority;
    }

    @Override
    public String toString() {
        return "Package{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", weightInGrams=" + weightInGrams +
                ", isPackagePriority=" + isPackagePriority +

                '}';
    }


    public Status getStatus() {
        return status;
    }

    public void  setStatus(Status status){
        this.status=status;
    }
}
