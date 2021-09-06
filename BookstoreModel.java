/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tchomnouarmelprogrammingckpt2;

import java.util.ArrayList;

/**
 *
 * @author armel
 */
public class BookstoreModel {
    
    // Array Lists to store chosen items from each
    ArrayList<String> myBooks = new ArrayList<String>();
    ArrayList<String> myDVD = new ArrayList<String>();
    ArrayList<String> myCD = new ArrayList<String>();
    
    private String memberName;
    private String membership;
    private double total;
    private int bkAmount;
    private int cAmount;
    private int dAmount;
    

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String member) {
        this.memberName = member;
    }
    
    public String getMembership(){
        return membership;
    }
    
    public void setMembership(String memebership){
        this.membership = membership;
    }

    public double getTotal() {
        return total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }

    public void setBkAmount(int bkAmount) {
        this.bkAmount = bkAmount;
    }

    public void setcAmount(int cAmount) {
        this.cAmount = cAmount;
    }

    public void setdAmount(int dAmount) {
        this.dAmount = dAmount;
    }

    public int getBkAmount() {
        return bkAmount;
    }

    public int getcAmount() {
        return cAmount;
    }

    public int getdAmount() {
        return dAmount;
    }

    
}
