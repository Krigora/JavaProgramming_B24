package day46_constructors;

public class Address {
    String street;
    String city;
    String state;
    String zipcode;
    String country = "US";

    public Address(String street, String city, String state, String zipcode) {

        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;




    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Address address = new Address("Berwyn ", "Chicago", "Illinois", "60656" );
        System.out.println(address);
        System.out.println(address.street);


    }

}