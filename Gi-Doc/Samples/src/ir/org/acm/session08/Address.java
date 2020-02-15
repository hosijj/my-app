package ir.org.acm.session08;

public class Address {

    private String country;
    private String state;
    private String city;
    private String address1;
    private String address2;

    public String getCountry() {
        return country;
    }

    public Address(String country, String state, String city, String address1, String address2) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.address1 = address1;
        this.address2 = address2;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

}
