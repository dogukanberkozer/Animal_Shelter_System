package oopProject;
public class Address {
    private String address, country, city;
    private int postalCode;

    public Address(String address, String country, String city, int postalCode) {
        this.address = address;
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
    
    @Override
    public String toString() {
    	return city+"-"+postalCode;
    }
}
