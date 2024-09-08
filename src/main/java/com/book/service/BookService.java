package com.book.service;

import com.book.entities.Book;

import java.util.List;

public interface BookService {

    Book addBook(Book book);

    Book getBookByBookId(String bookId);

    List<Book> getAllBooks();

    Book UpdateBook(Book book,String bookId);
}
