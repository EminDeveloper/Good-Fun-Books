package com.bookstore.goodbooks.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int stock_id;
    @Column(name = "stock_items")
    private String stock_items;
    @Column(name = "stock_type")
    private String stock_type;
    @Column(name = "stock_description")
    private String stock_description;
    @Column(name = "stock_number")
    private String stock_number;
}
