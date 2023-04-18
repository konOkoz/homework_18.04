package homework;

public class Address {
    String street;
    int houseNumber;

    public Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return  street + " " + houseNumber;
    }
}
