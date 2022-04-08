package com.bookstore.goodbooks.repositories;

import com.bookstore.goodbooks.domain.Sales;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository {

    void addSales();
    void editSales();
    void deleteSales();
    Sales searchSales();

}
