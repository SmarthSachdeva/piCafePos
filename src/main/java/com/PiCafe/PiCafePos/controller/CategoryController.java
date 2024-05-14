package com.PiCafe.PiCafePos.controller;
import com.PiCafe.PiCafePos.entities.Category;
import com.PiCafe.PiCafePos.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/pi_cafe_POS/api/v1/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public CategoriesResponse getAllCategories() {
        List<Category> categories = categoryService.getAllCategories();
        return new CategoriesResponse(categories);
    }

    // Inner class for response object
    static class CategoriesResponse {
        private List<String> categories;

        public CategoriesResponse(List<Category> categories) {
            this.categories = categories.stream().map(Category::getName).toList();
        }

        public List<String> getCategories() {
            return categories;
        }

        public void setCategories(List<String> categories) {
            this.categories = categories;
        }
    }
}
