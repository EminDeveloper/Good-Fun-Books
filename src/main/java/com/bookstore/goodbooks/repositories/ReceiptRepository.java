package com.bookstore.goodbooks.repositories;

import com.bookstore.goodbooks.domain.Receipt;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptRepository {

    void addReceipt();
    void editReceipt();
    void deleteReceipt();
    Receipt searchReceipt();
}
