package com.angelina.demo_cargo.repository;

import com.angelina.demo_cargo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
