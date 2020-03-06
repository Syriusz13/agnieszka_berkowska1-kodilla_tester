package com.kodilla.collections.adv.immutable;

public class ImmutableExample {

    public static void main(String[] args) {

        Book book = new Book("John Steward", "The last chance");

        System.out.println(book.getTitle());

        BookHacked bookHacked = new BookHacked(book.getAuthor(), book.getTitle());//używamy tej klasy jako substytut book

        bookHacked.modifyTitle("New Title");

        System.out.println(book.getTitle());
    }
}
