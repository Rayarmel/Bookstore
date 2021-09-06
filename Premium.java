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
public class Premium extends Member {
    private double membership;
    private boolean paid;
    private String payMeth;
    
    public Premium(String fName, String lName, double mem, String method, boolean paid) {
        super(fName, lName);
        this.membership = mem;
        this.payMeth = method;
        this.paid = paid;
    }
    
    public double getMembership() {
        return membership;
    }
    
    public boolean isPaid() {
        return paid;
    }
    
    public String getPayMeth() {
        return payMeth;
    }
    
    public void setMembership(double mem) {
        this.membership = mem;
    }
    
    public void setPaid(boolean p) {
        this.paid = p;
    }
    
    public void setPayMeth(String m) {
        this.payMeth = m;
    }
    
    
    
    @Override
    public void display() {
        System.out.println("Hello " + this.getFirstName() + " " + this.getLastName() + ", welcome back!");
        System.out.println("Your monthly membership is: " + membership);
        if (this.isPaid() == true) {
            System.out.println("Your monthly membership HAS been paid! THX!!");
        } else {
            System.out.println("Your monthly membership HAS NOT been paid! Please take care of it!! ");
        }
    }
    
}
