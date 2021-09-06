/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tchomnouarmelprogrammingckpt2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

/**
 *
 * @author armel
 */
public class TestHarness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BookstoreModel myModel = new BookstoreModel();
        BkStore myBkStore = new BkStore(myModel);
        myBkStore.setVisible(true);

        //Book Title Array
        ArrayList<String> bTitle = new ArrayList<String>();
        bTitle.add("The Giver");
        bTitle.add("Can't Hurt Me");
        bTitle.add("To Kill a Mockingbird");
        bTitle.add("Maze Runner");
        bTitle.add("The Hunger Games");
        bTitle.add("Divergent");
        bTitle.add("Percy Jackson & The Lightning Thief");
        bTitle.add("The Sea of Monsters");
        bTitle.add("Harry Potter and the Sorcerer's Stone");
        bTitle.add("Harry Potter and the Chamber of Secrets");

        //Book Author Array
        ArrayList<String> author = new ArrayList<String>();
        author.add("Lois Lowry");
        author.add("David Goggins");
        author.add("Harper Lee");
        author.add("James Dashner");
        author.add("Suzanne Collins");
        author.add("Veronica Roth");
        author.add("Rick Riordan");
        author.add("Rick Riordan");
        author.add("J.K. Rowling");
        author.add("J.K. Rowling");

        //Book Price Array
        ArrayList<Double> bPrice = new ArrayList<Double>();
        bPrice.add(15.99);
        bPrice.add(17.99);
        bPrice.add(12.99);
        bPrice.add(17.99);
        bPrice.add(18.99);
        bPrice.add(18.99);
        bPrice.add(20.99);
        bPrice.add(19.99);
        bPrice.add(24.99);
        bPrice.add(24.99);

        //CD Title Array
        ArrayList<String> cTitle = new ArrayList<String>();
        cTitle.add("Freak No More");
        cTitle.add("Club Can't Handle Me");
        cTitle.add("Throw It In The Bag");
        cTitle.add("Whatta Man");
        cTitle.add("I Don't Mind");
        cTitle.add("Not Afraid");
        cTitle.add("Buy U a Drank");

        //CD Artist Array
        ArrayList<String> artist = new ArrayList<String>();
        artist.add("Migos");
        artist.add("Flo Rida ft. David Guetta");
        artist.add("Fabolous ft. The-Dream");
        artist.add("Salt-N-Pepa ft. En Vogue");
        artist.add("User ft. Juicy J");
        artist.add("Eminem");
        artist.add("T-Pain");

        //CD Genre Array
        ArrayList<String> cGenre = new ArrayList<String>();
        cGenre.add("Rap");
        cGenre.add("Pop");
        cGenre.add("R&B");
        cGenre.add("Pop");
        cGenre.add("Pop");
        cGenre.add("Rap");
        cGenre.add("R&B");

        //CD Price Array
        ArrayList<Double> cPrice = new ArrayList<Double>();
        cPrice.add(9.99);
        cPrice.add(7.99);
        cPrice.add(8.99);
        cPrice.add(7.99);
        cPrice.add(8.99);
        cPrice.add(9.99);
        cPrice.add(7.99);

        //DVD Title Array
        ArrayList<String> dTitle = new ArrayList<String>();
        dTitle.add("Spider-Man Far From Home");
        dTitle.add("Avengers Endgame");
        dTitle.add("Justice League");
        dTitle.add("Aquaman");
        dTitle.add("It Chapter Two");
        dTitle.add("Joker");
        dTitle.add("The Wolf of Wall Street");
        dTitle.add("Madagascar");
        dTitle.add("Jurassic World");

        //DVD Company Array
        ArrayList<String> company = new ArrayList<String>();
        company.add("Marvel");
        company.add("Marvel");
        company.add("DC");
        company.add("DC");
        company.add("New Line Cinema & Vertigo Entertainment");
        company.add("Warner bros. Pictures");
        company.add("Paramount Pictures");
        company.add("DreamWorks Pictures");
        company.add("Universal Pictures");

        //DVD Genre Array
        ArrayList<String> dGenre = new ArrayList<String>();
        dGenre.add("Action & Adventure");
        dGenre.add("Action & Adventure");
        dGenre.add("Action & Adventure");
        dGenre.add("Action & Adventure");
        dGenre.add("Horror");
        dGenre.add("Drama & Thriller");
        dGenre.add("Comedy, Drama, & Crime Fiction");
        dGenre.add("Comedy, Children's Film, Adventure");
        dGenre.add("Science Fiction, Action & Adventure, & Thriller");

        //DVD Price Array
        ArrayList<Double> dPrice = new ArrayList<Double>();
        dPrice.add(25.99);
        dPrice.add(29.99);
        dPrice.add(24.99);
        dPrice.add(26.99);
        dPrice.add(21.99);
        dPrice.add(27.99);
        dPrice.add(26.99);
        dPrice.add(18.99);
        dPrice.add(26.99);

        // variables for stuff
        String fName;
        String lName;
        String fName2;
        String lName2;

        // Scanner
        Scanner scan = new Scanner(System.in);

        // variables for loops
        int loop = 1;
        int loop2 = 1;

        //variables for totals
        double totB = 0.0;
        double totC = 0.0;
        double totD = 0.0;

        // variables to check number of new members
        int newMem = 0;
        int newPrem = 0;

        // filescanner to get info from textfile and implement it into code
        Scanner fileScanner;

        // arraylists to store info from text file
        ArrayList<String> bookTitle = new ArrayList<String>();
        ArrayList<String> bookAuthor = new ArrayList<String>();
        ArrayList<Integer> bookInv = new ArrayList<Integer>();
        ArrayList<Double> bookPrice = new ArrayList<Double>();
        ArrayList<String> cdTitle = new ArrayList<String>();
        ArrayList<String> cdAuthor = new ArrayList<String>();
        ArrayList<Integer> cdInv = new ArrayList<Integer>();
        ArrayList<Double> cdPrice = new ArrayList<Double>();
        ArrayList<String> dvdTitle = new ArrayList<String>();
        ArrayList<String> dvdAuthor = new ArrayList<String>();
        ArrayList<Integer> dvdInv = new ArrayList<Integer>();
        ArrayList<Double> dvdPrice = new ArrayList<Double>();

        // variables used for the values in text file
        ArrayList<String> bok = new ArrayList<String>();
        ArrayList<String> Cd = new ArrayList<String>();
        ArrayList<String> Dvd = new ArrayList<String>();
        bok.add("Books: ");
        Cd.add("CDs: ");
        Dvd.add("DVDs: ");
        //String bok = null;
        //String Cd = null;
        //String Dvd= null;

        double finalT = 0.0;

        int sales = 0;
        int sales1 = 0;
        int sales2 = 0;

        double totBB = 0.0;
        double totCC = 0.0;
        double totDD = 0.0;

        int bIn = 0;
        int cIn = 0;
        int dIn = 0;

        // try catch statements for FileNotFoundException
        try {
            fileScanner = new Scanner(new File("C:\\Users\\armel\\OneDrive\\Documents\\Inventory.txt"));
            String line;
            while (fileScanner.hasNext()) {
                line = fileScanner.nextLine();
                if (line.contains("book")) {
                    String[] arrOfBook = line.split(", ");
                    bookTitle.add(arrOfBook[1]);
                    bookAuthor.add(arrOfBook[2]);
                    bookInv.add(Integer.parseInt(arrOfBook[3]));
                    bookPrice.add(Double.parseDouble(arrOfBook[4]));
                } else if (line.contains("CD")) {
                    String[] arrOfCD = line.split(", ");
                    cdTitle.add(arrOfCD[1]);
                    cdAuthor.add(arrOfCD[2]);
                    cdInv.add(Integer.parseInt(arrOfCD[3]));
                    cdPrice.add(Double.parseDouble(arrOfCD[4]));
                } else if (line.contains("DVD")) {
                    String[] arrOfDVD = line.split(", ");
                    dvdTitle.add(arrOfDVD[1]);
                    dvdAuthor.add(arrOfDVD[2]);
                    dvdInv.add(Integer.parseInt(arrOfDVD[3]));
                    dvdPrice.add(Double.parseDouble(arrOfDVD[4]));
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Caught FileNotFoundException for Inventory.txt. Try again making sure the file name and path are correct.");
        }

        // nested try catch statements
        // first try catch is for input mismatch exceptions and general exceptions
        try {
            // First while loop that runs through the entire code
            while (loop != 0) {
                // First menu to choose membership

                System.out.println("Welcome to Mel's Bookstore!");
                System.out.println("\tIf you're a regular member, please enter '1' ");
                System.out.println("\tIf you're a premium member, please check your membership status "
                        + "and continue to the shop by entering '2' ");
                System.out.println("To exit the store, please enter '3'");
                loop2 = 1;

                // variable used for switch case which is taken from user
                int menu = scan.nextInt();

                switch (menu) {
                    case 1:
                        // gets member credentials to create new member

                        System.out.println("Please enter your first and last name: ");
                        fName = scan.nextLine();
                        lName = scan.nextLine();

                        Member member = new Member(fName, lName);
                        member.display();
                        newMem += 1;
                        break;

                    case 2:
                        // gets member credentials to create new premium member

                        System.out.println("Please enter your first and last name: ");
                        fName2 = scan.nextLine();
                        lName2 = scan.nextLine();

                        Premium member2 = new Premium(fName2, lName2, 20.0, "Credit Card", true);
                        member2.display();
                        newPrem += 1;
                        break;
                    case 3:
                        // sets loops to 0 and prints an goodbye message

                        System.out.println("Goodbye! Hope to see you again!");
                        loop = 0;
                        loop2 = 0;
                        newMem = 0;
                        newPrem = 0;
                        break;
                    default:
                        // error if the 3 choices given aren't chosen

                        System.out.println("ERROR! Please enter a number from 1-3");

                }

                // second loop within the first loop that runs through the second menu
                while (loop2 != 0) {

                    // second menu for purchasing items
                    System.out.println("\n What would you like to purchase?");
                    System.out.println("\tTo purchase from the book section, "
                            + "enter '1'");
                    System.out.println("\tTo purchase from the cd section, "
                            + "enter '2'");
                    System.out.println("\tTo purchase from the dvd section, "
                            + "enter '3'");
                    System.out.println("\tTo check your cart total, enter 4");
                    System.out.println("\tTo exit the store and see end of "
                            + "day report, enter 5");

                    // variable for switch case which is taken from user
                    int menu2 = scan.nextInt();

                    switch (menu2) {
                        case 1:
                            // purchasing section for books

                            System.out.println("Please choose a book from 1-10");
                            int book = scan.nextInt() - 1;
                            String bk = bookTitle.get(book);
                            sales += 1;
                            Book book1 = new Book(bookTitle.get(book), bookPrice.get(book), bookAuthor.get(book));
                            book1.display();
                            System.out.println("How many of this book would you like?");
                            int numBook = scan.nextInt();
                            int B = numBook;
                            double total = numBook * bPrice.get(book);
                            System.out.println("This book purchase will cost you: $" + total);
                            //numB = numBook;
                            //valB = bPrice.get(book);
                            int boIn = bookInv.get(book) - B;
                            bIn = boIn;
                            bookInv.set(book, bIn);

                            totB = total;
                            totBB = B * bPrice.get(book);
                            //bok = bk;
                            bok.add(bk);
                            break;
                        case 2:
                            // purchasing sections for CDs

                            System.out.println("Please choose a CD from 1-7");
                            int cd = scan.nextInt() - 1;
                            String cD = cdTitle.get(cd);
                            sales1 += 1;
                            CD cd1 = new CD(cdTitle.get(cd), cdPrice.get(cd), cdAuthor.get(cd), cGenre.get(cd));
                            cd1.display();
                            System.out.println("How many of this CD would you like?");
                            int numCD = scan.nextInt();
                            int C = numCD;
                            double cTotal = numCD * cPrice.get(cd);
                            System.out.println("This CD purchase will cost you $" + cTotal);
                            int cdIn = cdInv.get(cd) - C;
                            cIn = cdIn;
                            cdInv.set(cd, cIn);
                            totC = cTotal;
                            totCC = C * cPrice.get(cd);
                            //Cd = cD;
                            Cd.add(cD);
                            break;
                        case 3:
                            // purchasing section for DVDs

                            System.out.println("Please choose a DVD from 1-9");
                            int dvd = scan.nextInt() - 1;
                            sales2 += 1;
                            String dVd = dvdTitle.get(dvd);
                            DVD dvd1 = new DVD(dvdTitle.get(dvd), dvdPrice.get(dvd), dvdAuthor.get(dvd), dGenre.get(dvd));
                            dvd1.display();
                            System.out.println("How many of this DVD would you like?");
                            int numDVD = scan.nextInt();
                            int D = numDVD;
                            double dTotal = numDVD * dPrice.get(dvd);
                            System.out.println("This DVD purchase will cost you $" + dTotal);
                            int dvIn = dvdInv.get(dvd) - D;
                            dIn = dvIn;
                            dvdInv.set(dvd, dIn);
                            totD = dTotal;
                            totDD = D * dPrice.get(dvd);
                            //Dvd = dVd;
                            Dvd.add(dVd);
                            break;
                        case 4:
                            // calculates the user's total from book, CD, and DVD

                            double finalTot = totB + totC + totD;
                            //finalT = totBB + totCC + totDD;
                            System.out.println("Your cart total is: $" + finalTot);
                            break;
                        case 5:
                            // Ends the 2nd loop and displays the end of day report
                            System.out.println("Goodbye! Hope to see you again!");

                            FileOutputStream fs;
                            FileOutputStream fo;
                            
                            // try catch for file not found exceptions and IO exceptions
                            try {
                                fs = new FileOutputStream("C:\\Users\\armel\\OneDrive\\Documents\\EndOfDayReport.txt");
                                PrintWriter outFS = new PrintWriter(fs);
                                outFS.println("END OF DAY REPORT: ");
                                finalT = totBB + totCC + totDD;
                                outFS.println("\t \tTitles of what was purchased: " + bok + " " + Cd + " " + Dvd);
                                outFS.println("\t \tNew Members: " + (newMem + newPrem));
                                outFS.println("\t \tTotal Sales: " + (sales + sales1 + sales2));
                                outFS.println("\t \tTotal Revenue: " + finalT);

                                fo = new FileOutputStream("C:\\Users\\armel\\OneDrive\\Documents\\EndOfDayInventory.txt");
                                PrintWriter outFO = new PrintWriter(fo);
                                outFO.println("END OF DAY Inventory: ");
                                int b = 0;
                                // while loop to print out all the books and their left over inventory
                                while (b < 10) {
                                    outFO.println(bookTitle.get(b) + ", " + bookAuthor.get(b) + ", " + bookInv.get(b) + ", " + bookPrice.get(b));
                                    b++;
                                }
                                int c = 0;
                                // while loop to print out all the cds and their left over inventory
                                while (c < 7) {
                                    outFO.println(cdTitle.get(c) + ", " + cdAuthor.get(c) + ", " + cdInv.get(c) + ", " + cdPrice.get(c));
                                    c++;
                                }
                                int d = 0;
                                // while loop to print out all the dvds and their left over inventory
                                while (d < 9) {
                                    outFO.println(dvdTitle.get(d) + ", " + dvdAuthor.get(d) + ", " + dvdInv.get(d) + ", " + dvdPrice.get(d));
                                    d++;
                                }

                                // closes the print writer and output stream
                                outFS.close();
                                outFO.close();
                                fs.close();
                                fo.close();
                                
                            } catch (FileNotFoundException ex) {
                                System.out.println("Caught FileNotFoundException for outputData.txt. Try again making sure the file name and path are correct.");
                            } catch (IOException ex) {
                                System.out.println("Caught IOException when closing output stream. Try again.");
                            }

                            // ends the loop and resets all values
                            loop2 = 0;
                            totB = 0.0;
                            totC = 0.0;
                            totD = 0.0;
                            break;
                        default:
                            // error if the 5 choices aren't chosen
                            System.out.println("ERROR! Please enter a number from 1-5");
                    }
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR! Value is not a number, try again.");           
        } catch (Exception ex) {
            System.out.println("ERROR! Exception found.");
        }

    }

}
