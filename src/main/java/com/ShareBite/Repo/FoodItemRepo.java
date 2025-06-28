package com.ShareBite.Repo;
import com.ShareBite.Entity.FoodItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepo extends JpaRepository<FoodItems,Long> {
}
