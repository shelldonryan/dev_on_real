package domain.repositories;

import domain.entities.Book;

import java.util.List;

public interface BookRepository {
    void addBook(Book book);

    Book getBookById(String id);

    List<Book> searchBooks(String keyword);

    List<Book> getAllBooks();
}