package com.bookstore.goodbooks.repositories;

import com.bookstore.goodbooks.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    void addUser();
    void editUser();
    void deleteUser();
    User searchUser();

}
