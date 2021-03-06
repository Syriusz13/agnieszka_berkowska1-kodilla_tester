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

/* inny sposób
import java.util.ArrayList;
import java.util.List;

public class BookApplication {

public static void main(String[] args) {
BookManager bookManager = new BookManager();

List<Book> bookList = new ArrayList<>();
bookList.add(bookManager.createBook("Ala ma kota", "Nieznay"));
bookList.add(bookManager.createBook("Mysz na wczasach", "Kot w butach"));
bookList.add(bookManager.createBook("Bolek i Lolek", "Tosia"));
bookList.add(bookManager.createBook("Bolek i Lolek", "Tosia"));

for (Book book : bookList) {
System.out.println("Book hashcode " + book.hashCode());
}

for (Book book : bookList) {
bookManager.createBookList(book);
}

BookComparator bookComparator = new BookComparator();
for (Book book : bookList) {
for (Book book1 : bookList)
if (bookComparator.compare(book,book1) == 0) {
System.out.println("Obiekty są takie same");
}else {
System.out.println("Obiekt są różne");
}
}

bookManager.printBooks();

for (Book book : bookManager.books)
System.out.println("Books hashcode: " + book.hashCode());
}
}
 */