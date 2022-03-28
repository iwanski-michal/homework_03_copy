package org.pjatk.products;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Product()
    {}
    //Getters
    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
    //Setters
    public void setName(String n){
        name = n;
    }
    public void setPrice(Double p){
        price = p;
    }

}
