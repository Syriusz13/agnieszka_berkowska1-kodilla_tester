package com.kodilla.collections.adv.immutable;

public class ImmutableExample {

    public static void main(String[] args) {

        Book book = new BookHacked("John Steward", "The last chance"); //podmiana new Book na new BookHacked

        System.out.println(book.getTitle());

        BookHacked bookHacked = (BookHacked) book;//używamy tej klasy jako substytut book

        bookHacked.modifyTitle("New Title");

        System.out.println(book.getTitle());
    }
}
