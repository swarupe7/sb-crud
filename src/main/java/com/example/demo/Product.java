package com.example.demo;

public class Product {
    private Integer id;
    private String name;
    private double price;

    // Constructor with all fields
    public  Product(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    

    // Getter for id
    public Integer getId() {
        return id;
    }

    // Setter for id
    public void setId(Integer id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // toString() method
    // @Override
    // public String toString() {
    //     return "Product{" +
    //             "id=" + id +
    //             ", name='" + name + '\'' +
    //             ", price=" + price +
    //             '}';
    // }
}

