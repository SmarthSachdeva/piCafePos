package com.PiCafe.PiCafePos.service;


import com.PiCafe.PiCafePos.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
