package inharitance;

import java.util.List;

public class Employer {
    private int id;
    private String name;
    private Address address;

    public Employer() {
    }

    //      example of composition
    public Employer(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    //      example of agregation
    public Employer(int id, String name, String city, String street, int zipCode) {
        this.id = id;
        this.name = name;
        this.address = new Address(city, street, zipCode);

    }

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
