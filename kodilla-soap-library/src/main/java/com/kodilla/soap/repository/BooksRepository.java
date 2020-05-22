package com.kodilla.soap.repository;

import com.kodilla.library.soap.Book;
import com.kodilla.library.soap.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BooksRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {
        Book book = new Book();
        book.setAuthor("JRR Tolkien");
        book.setGenre(Genre.FANTASY);
        book.setSignature("123abc");
        book.setYear(1960);
        book.setTitle("Silmarilion");

        books.put(book.getSignature(), book);
    }

    public Book findBook(String signature) {
        Assert.notNull(signature, "You have to specify the course's name");
        return books.get(signature);
    }
}
