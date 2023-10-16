package food;

public class Restaurant {
	private String name;
    private Address address;
    private String phoneNumber;
    private double rating;

    public Restaurant(String name, Address address, String phoneNumber, double rating) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.rating = rating;
    }
    
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getRating() {
        return rating;
    }
    
    public String toString() {
        return "Restaurant Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nRating: " + rating;
    }
    
}
