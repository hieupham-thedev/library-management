package fa.training.dao;

import fa.training.model.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class BookDao {

    private List<Book> books;

    public BookDao() {
        books = new ArrayList<>();
        Book book1 = new Book("123", new HashSet<String>(), "US", 1990, "Manning", new Date());
        Book book2 = new Book("456", new HashSet<String>(), "VN", 2009, "Oreilly", new Date());
        books.add(book1);
        books.add(book2);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Book getBookByIsbn(String isbn) {
        return books.stream().filter(book -> isbn.equals(book.getIsbn())).findAny().orElse(null);
    }

    public List<Book> searchByIsbnAuthorPublisher(String searchWord) {
        return books.stream().filter(book ->
                (book.getIsbn().contains(searchWord)) ||
                        (book.getAuthors().stream().filter(author -> author.contains(searchWord)).findFirst().isPresent()) ||
                        (book.getPublisher().contains(searchWord))
        ).collect(Collectors.toList());
    }
}
