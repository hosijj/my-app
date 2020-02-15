package ir.org.acm.session08;

// Method Delegation Sample
public class Customer {

    private int id;
    private String name;
    private String phoneNumber;

//    private String country;
//    private String state;
//    private String city;
//    private String address1;
//    private String address2;

    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getState() { // Method Delegation

        return address.getState();

    }

}
