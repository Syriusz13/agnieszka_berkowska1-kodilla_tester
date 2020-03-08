package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BookManager {

    Map<String, Book> library;           //deklarujemy zmienną library która jest Mapą String --> Book chwilowo z warością null

    public BookManager() {               //konstruktor tworzy pustą mapę
        library = new HashMap<>();
    }

    private String createKey(String title, String author) {     //łączę tytuł i autora w 1 String
        return title + "$$$" + author;
    }

    public Book createBook(String title, String author) {
        String key = createKey(title, author);              //sprawdzam czy książka jest w library
        Book bookFromLibrary = library.get(key);

        if (Objects.nonNull(bookFromLibrary)) {
            return bookFromLibrary;
        } else {
            Book book = new Book(title, author);            //jreżeli nie ma to ją dodaję
            library.put(key, book);
            return book;
        }
    }
}
