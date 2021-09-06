/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tchomnouarmelprogrammingckpt2;

/**
 *
 * @author armel
 */
abstract class Product {
    private String name;
    private double price;
    //private int inventory;
    
    public Product(String n, double p) {
        this.name = n;
        this.price = p;
//        this.inventory = i;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
//    public int getInventory() {
//        return inventory;
//    }
    
    public void setName(String n) {
        this.name = n;
    }
    
    public void setPrice(double p) {
        this.price = p;
    }
    
    
    public void display() {
        System.out.println("The name of your product is: " + name);
        System.out.println("This will cost you: $" + price);
    }
    
}
