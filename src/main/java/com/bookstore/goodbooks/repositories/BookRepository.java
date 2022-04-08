package com.bookstore.goodbooks.repositories;

import com.bookstore.goodbooks.domain.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository {

    void addBook();
    void editBook();
    void deleteBook();
    Book searchBook();

}
