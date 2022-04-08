package com.bookstore.goodbooks.domain;

import lombok.Data;

@Data
public class Book {

    private int book_id;
    private String book_name;
    private String book_author;
    private String book_type;
    private String book_price;
    private String book_description;
    private int book_customer_id;

}
