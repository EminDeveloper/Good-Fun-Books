package com.bookstore.goodbooks.repositories;

import com.bookstore.goodbooks.domain.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository {

    Role addRole();

    void editRole();

    void deleteRole();

    void searchRole();

    void assignRole();


}
