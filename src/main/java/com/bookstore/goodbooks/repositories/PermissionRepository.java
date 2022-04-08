package com.bookstore.goodbooks.repositories;

import com.bookstore.goodbooks.domain.Permission;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository {

    void addPermission();
    void editPermission();
    void deletePermission();
    Permission searchPermission();
}
