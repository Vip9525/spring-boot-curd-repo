package com.book.controller;

import com.book.entities.Book;
import com.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<Book>  addBook(@RequestBody  Book book){

        return ResponseEntity.ok(bookService.addBook(book));
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Book>  getBook(@PathVariable("bookId") String bookId){
        return ResponseEntity.ok(bookService.getBookByBookId(bookId));
    }

    @GetMapping
    public ResponseEntity<List<Book>>  getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @PutMapping("/{bookId}")
    public ResponseEntity<Book>  updateBook(@RequestBody Book book,@PathVariable("bookId") String bookId){
        return ResponseEntity.ok(bookService.UpdateBook(book,bookId));
    }
}
