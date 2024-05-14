package com.PiCafe.PiCafePos.service;

import com.PiCafe.PiCafePos.entities.MenuItem;

import java.util.List;

public interface MenuService {
    List<MenuItem> getAllMenuItems();
    List<MenuItem> getMenuItemsByCategory(String category);
}

