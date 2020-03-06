package com.kodilla.collections.adv.immutable;

public class BookHacked extends Book{

    public BookHacked(String author, String title) {
        super(author, title);
    }

    public void modifyTitle (String newTitle) {     //metoda pozwalająca zmienić tytuł
        title = newTitle;
    }
}
