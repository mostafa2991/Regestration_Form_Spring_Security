package com.mostafa.spring.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mostafa.spring.entities.Role;


@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {

 Role findByRole(String role);
}
