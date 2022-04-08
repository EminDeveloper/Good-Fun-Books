package com.bookstore.goodbooks.repositories;

import com.bookstore.goodbooks.domain.Inventory;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository {

    void addInventory();
    void editInventory();
    void deleteInventory();
    Inventory searchInventory();

}
