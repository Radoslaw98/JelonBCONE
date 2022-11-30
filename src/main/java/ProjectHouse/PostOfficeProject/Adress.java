package ProjectHouse.PostOfficeProject;

public class Adress {

    private String street;
    private String houseNumber;
    private String  postCode;

    public Adress(String street, String houseNumber, String postCode) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
