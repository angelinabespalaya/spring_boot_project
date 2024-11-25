package com.angelina.demo_cargo.repository;

import com.angelina.demo_cargo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}