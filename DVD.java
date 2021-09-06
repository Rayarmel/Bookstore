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
public class DVD extends Product {
    private String company;
    private String filmType;
    
    public DVD(String name, double price, String comp, String film) {
        super(name, price);
        this.company = comp;
        this.filmType = film;
    }
    
    public String getCompany() {
        return company;
    }
    
    public String getFilmType() {
        return filmType;
    }
    
    public void setCompany(String s) {
        this.company = s;
    }
    
    public void setFilmType(String f) {
        this.filmType = f;
    }
    
    
    @Override
    public void display() {
        System.out.println("The name of your product is: " + this.getName());
        System.out.println("This will cost you: $" + this.getPrice());
        System.out.println("This movie was brought to you by: " + company);
        System.out.println("This is a " + filmType + " movie");
    }
    
}
