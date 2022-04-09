package com.bookstore.goodbooks.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int book_id;
    @Column(name = "book_name")
    private String book_name;
    @Column(name = "book_author")
    private String book_author;
    @Column(name = "book_type")
    private String book_type;
    @Column(name = "book_price")
    private String book_price;
    @Column(name = "book_description")
    private String book_description;
    @Column(name = "book_customer_id")
    private int book_customer_id;

}
