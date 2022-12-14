package com.example.SpringJwtAuthentication.repository;

import com.example.SpringJwtAuthentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    @Query(value = "SELECT * FROM user_tb u WHERE u.username = ?1"
            , nativeQuery = true)
    User existsByUserName(String username);



//    Boolean exitByUsername(String username);
//
//    Boolean exitByEmail(String email);
}
