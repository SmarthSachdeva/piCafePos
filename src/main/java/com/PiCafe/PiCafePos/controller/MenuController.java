package com.PiCafe.PiCafePos.controller;

import com.PiCafe.PiCafePos.entities.MenuItem;
import com.PiCafe.PiCafePos.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/pi_cafe_POS/api/v1/categories/items")
    public Map<String, List<MenuItem>> getMenuItems(
            @RequestHeader("Authorization") String authorization,
            @RequestParam(required = false) String category) {

        // Here you can validate the JWT token

        Map<String, List<MenuItem>> response = new HashMap<>();
        if (category != null && !category.isEmpty()) {
            response.put("items", menuService.getMenuItemsByCategory(category));
        } else {
            response.put("items", menuService.getAllMenuItems());
        }
        return response;
    }
}
