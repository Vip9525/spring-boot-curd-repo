package com.book.service.impl;

import com.book.entities.Book;
import com.book.repository.BookRepository;
import com.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookByBookId(String bookId) {
       return bookRepository.findById(bookId).orElseThrow(()->new RuntimeException("Book Not Found"));
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book UpdateBook(Book book, String bookId) {
      Optional<Book> oldBook= bookRepository.findById(bookId);
         if(oldBook.isPresent()) {
            Book book1= oldBook.get();
             book1.setBookName(book.getBookName());
             book1.setAuthorName(book.getAuthorName());
             return bookRepository.save(book1);
         }
          return null;
    }
}
