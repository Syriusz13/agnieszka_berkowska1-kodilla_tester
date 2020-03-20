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

/* inny sposób
import java.util.LinkedList;
import java.util.List;

public class BookManager {
List<Book> books = new LinkedList<>();
BookComparator bookComparator = new BookComparator();

public Book createBook(String title, String author) {
return new Book(title, author);
}

public List<Book> createBookList(Book book) {
if (!books.contains(book)) books.add(book);
return books;
}


public void printBooks() {
for (Book book : books)
System.out.println(book);
}
}


dodana klasa b
BookComparator
import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
@Override
public int compare(Book o1, Book o2) {
return o1.hashCode() - o2.hashCode();
}
}
 */