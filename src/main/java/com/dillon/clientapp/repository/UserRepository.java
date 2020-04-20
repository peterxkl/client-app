package com.dillon.clientapp.repository;

import com.dillon.clientapp.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author DillonXie
 * @version 1.0
 * @date 2020/4/19 21:02
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
