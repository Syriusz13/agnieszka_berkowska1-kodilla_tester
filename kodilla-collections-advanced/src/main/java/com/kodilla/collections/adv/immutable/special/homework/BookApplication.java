package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {

    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Book book = new Book("Ala","Makota");
        Book book2 = new Book("Ala","Makota");

        System.out.println(book == book2);

        Book bookFromManager = manager.createBook("Ala","Makota");
        Book bookFromManager2 = manager.createBook("Ala","Makota");

        System.out.println(bookFromManager == bookFromManager2);
    }
}
