package com.ShareBite.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ShareBite.Entity.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface DonorRepo extends JpaRepository<Donor,Long> {



    public List<Donor> findAll();

    Donor findByEmail(String email);
}
