package com.bookstore.goodbooks.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Receipt")
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int receipt_id;
    @Column(name = "receipt_type")
    private String receipt_type;
    @Column(name = "receipt_description")
    private String receipt_description;
    @Column(name = "receipt_number")
    private String receipt_number;
    @Column(name = "receipt_customer_id")
    private int receipt_customer_id;

}
