package org.example;

//Parameterized Constructor
//Create a Book class with fields title, author, and price.
//Initialize them using a parameterized constructor.


class  Book{
    public String title;
    public int price;
    public String author;

    public Book(String title, int price, String author){
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString(){
        return  "Book Name: "+title+"\n"+
                "Price: " +price+"\n"+
                "Author of the book: "+author+"\n";
    }
}

public class Question10 {
    public static void main(String[] args) {
        Book book1 = new Book("Atomic Habits", 599, "James Clear");
        Book book2 = new Book("The Midnight Library",799, "Matt Haig");

        System.out.println(book1);
        System.out.println(book2);
    }
}
