package ProjectHouse.PostOfficeProject;

public class Letter {


    private Adress SenderAdress;
    private Adress ReciverAdress;
    private boolean priority;
private Status status;

    public Letter(Adress senderAdress, Adress reciverAdress) {
        SenderAdress = senderAdress;
        ReciverAdress = reciverAdress;
        this.priority = true;
        this.status = Status.CREATED;
    }

    public  double letterPrice(){
        return priority ? 8.5 : 6;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "SenderAdress=" + SenderAdress +
                ", ReciverAdress=" + ReciverAdress +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }
}
