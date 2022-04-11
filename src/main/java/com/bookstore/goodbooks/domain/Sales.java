package com.bookstore.goodbooks.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Sales")
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sale_id;
    @Column(name = "sale_customer_id")
    private int sale_customer_id;
    @Column(name = "sale_amount")
    private String sale_amount;
    @Column(name = "sale_type")
    private String sale_type;
    @Column(name = "sale_description")
    private String sale_description;

}
