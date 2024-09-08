package com.book.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String bookId;
    @Column(name="book_name")
    private String bookName;
    @Column(name="author_name")
    private String authorName;
}
