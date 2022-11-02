package postOffice;

public class Letter {

    private Address senderAddress;

    private Address receiverAddress;

    private boolean isPrioritize;

    private Status status;

    public Letter(Address senderAddress, Address receiverAddress, boolean isPrioritize) {
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
        this.isPrioritize = isPrioritize;
        this.status = Status.CREATED;
    }

    public double getPrice() {
        return isPrioritize ? 8.5 : 6;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
