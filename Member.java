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
public class Member {
    
    private String firstName;
    private String lastName;
    
    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    
    public void setFirstName(String fName) {
        this.firstName = fName;
    }
    
    public void setLastName(String lName) {
        this.lastName = lName;
    }
    
    
    
    
    
//    public void memberName() {
//        Scanner scan = new Scanner();
//        System.out.println("Enter member first name: ");
//        firstName = scan.nextLine();
//        
//        System.out.println("Enter member last name: ");
//        lastName = scan.nextLine();
//    }
    
    public void display() {
        //memberName();
        System.out.println("Hello " + firstName + " " + lastName + ", welcome back!");
        System.out.println("Your membership is free!");
        
    }
    
}
