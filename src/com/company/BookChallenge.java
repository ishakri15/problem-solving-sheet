package com.company;

class Book{
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static{
        totalBooks=0;
    }
    {
        totalBooks++;
    }

    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }

    public static int getTotalBooks(){
        return totalBooks;
    }
    public void borrowBook(){
        if(isBorrowed){
            System.out.println("This book is already borrowed");
        }else{
            this.isBorrowed = true;
            System.out.println("Happy reading :)");
        }
    }
    public void returnBook(){
        if(isBorrowed){
            System.out.println("Thank you!");
            this.isBorrowed = false;
        }else{
            System.out.println("This book is already present in the library.");
        }
    }
}
public class BookChallenge {
    static void main(String[] args) {
        Book bk = new Book("84739","Java","Harry");
        bk.borrowBook();
        bk.returnBook();
        Book bk2 = new Book("84739");
        bk.borrowBook();
        System.out.println(Book.getTotalBooks());
    }
}
