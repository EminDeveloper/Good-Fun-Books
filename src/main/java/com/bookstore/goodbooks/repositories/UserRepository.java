package com.bookstore.goodbooks.repositories;

import com.bookstore.goodbooks.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    void addUser();
    void editUser();
    void deleteUser();
    User searchUser();

}
