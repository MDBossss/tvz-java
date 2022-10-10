package hr.java.production.model;

public class Factory {
    private String name;
    private Address address;
    private Item[] items; //array

    public Factory(){}

    public Factory(String name, Address address, Item[] items) {
        this.name = name;
        this.address = address;
        this.items = items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Item[] getItems() {
        return items;
    }



}
