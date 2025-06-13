package com.ShareBite.Repo;

import com.ShareBite.Entity.Login;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<Login,String> {

    boolean existsByEmail(String email);
}