package com.ShareBite.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ShareBite.Entity.FoodCatagory;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodCategorayRepo extends JpaRepository<FoodCatagory,Long> {
}
