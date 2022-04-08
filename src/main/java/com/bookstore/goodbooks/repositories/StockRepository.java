package com.bookstore.goodbooks.repositories;

import com.bookstore.goodbooks.domain.Stock;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository {

    void addStock();
    void editStock();
    void deleteStock();
    Stock searchStock();

}
