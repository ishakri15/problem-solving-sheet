package com.company;

class LibraryItem{
    private int itemID;
    private String title;
    private String author;

    public LibraryItem(int itemID, String title, String author) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
    }

    void checkout(){
        System.out.println("you have checked out");
    }
    void returnItem(){
        System.out.println("you have returned the item.");
    }
}
class Books extends LibraryItem{
    private int ISBN;

    public Books(int itemID, String title, String author, int ISBN) {
        super(itemID, title, author);
        this.ISBN = ISBN;
    }
}
class Magazine extends LibraryItem{
    public Magazine(int itemID, String title, String author, int issueNumber) {
        super(itemID, title, author);
        this.issueNumber = issueNumber;
    }

    private int issueNumber;

}
class Dvd extends LibraryItem{
    private int duration;

    public Dvd(int itemID, String title, String author, int duration) {
        super(itemID, title, author);
        this.duration = duration;
    }
}
public class LibraryItemQues {
    static void main() {
        Dvd dvd = new Dvd(233, "Learn Java", "A Man", 30);
        dvd.checkout();
    }
}
