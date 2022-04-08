package com.bookstore.goodbooks.domain;

import lombok.Data;

@Data
public class Receipt {

    private int receipt_id;
    private String receipt_type;
    private String receipt_description;
    private String receipt_number;
    private int receipt_customer_id;

}
