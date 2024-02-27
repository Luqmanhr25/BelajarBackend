package com.example.batch26.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.batch26.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    @Query(value = "SELECT * FROM tb_m_roles WHERE name = ?1", nativeQuery = true)
    public Role findByName(String name);
}
