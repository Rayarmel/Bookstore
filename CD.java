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
public class CD extends Product {
    private String artist;
    private String musicGenre;
    
    public CD(String name, double price, String art, String genre) {
        super(name, price);
        this.artist = art;
        this.musicGenre = genre;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public String getMusicGenre() {
        return musicGenre;
    }
    
    
    public void setArtist(String a) {
        this.artist = a;
    }
    
    public void setMusicGenre(String m) {
        this.musicGenre = m;
    }
    
    
    @Override
    public void display() {
        System.out.println("The name of your product is: " + this.getName());
        System.out.println("This will cost you: $" + this.getPrice());
        System.out.println(artist + " wrote this song");
        System.out.println("This is " + musicGenre + " music");
    }
    
    
}
