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
public class Book extends Product {
    private String author;
    //private String genre;
    
    public Book(String name, double price, String auth) {
        super(name, price);
        this.author = auth;
        //this.genre = gen;
    }
    
    public String getAuthor() {
        return author;
    }
    
//    public String getGenre() {
//        return genre;
//    }
    
    public void setAuthor(String auth) {
        this.author = auth;
    }
    
//    public void setGenre(String gen) {
//        this.genre = gen;
//    }
    
    
    @Override
    public void display() {
        System.out.println("The name of your product is: " + this.getName());
        System.out.println("This will cost you: $" + this.getPrice());
        System.out.println("The author of this book is: " + author);
    }
    
}
