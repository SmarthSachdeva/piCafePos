package com.PiCafe.PiCafePos.service;

import com.PiCafe.PiCafePos.entities.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Override
    public List<Category> getAllCategories() {
        // Hardcoded list of categories
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1L, "Pizza"));
        categories.add(new Category(2L, "Coffee"));
        categories.add(new Category(3L, "Burger"));
        categories.add(new Category(4L, "Salad"));
        return categories;
    }
}

