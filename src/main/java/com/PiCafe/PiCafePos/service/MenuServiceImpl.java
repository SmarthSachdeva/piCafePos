package com.PiCafe.PiCafePos.service;
import com.PiCafe.PiCafePos.entities.MenuItem;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuServiceImpl implements MenuService {

    private final List<MenuItem> menuItems;

    public MenuServiceImpl() {
        // Initialize dummy data
        this.menuItems = List.of(
                new MenuItem(1L, "Classic Burger", 120.0, "2024-05-01", "101"),
                new MenuItem(2L, "Chicken Burger", 150.0, "2024-05-05", "101"),
                new MenuItem(3L, "Veggie Burger", 100.0, "2024-05-10", "101"),
                new MenuItem(4L, "Margherita Pizza", 200.0, "2024-05-02", "102"),
                new MenuItem(5L, "Pepperoni Pizza", 250.0, "2024-05-07", "102"),
                new MenuItem(6L, "Mushroom Pizza", 220.0, "2024-05-12", "102"),
                new MenuItem(7L, "Caesar Salad", 180.0, "2024-05-03", "103"),
                new MenuItem(8L, "Greek Salad", 200.0, "2024-05-08", "103"),
                new MenuItem(9L, "Caprese Salad", 190.0, "2024-05-13", "103"),
                new MenuItem(10L, "Spaghetti Carbonara", 250.0, "2024-05-04", "104"),
                new MenuItem(11L, "Penne Arrabiata", 230.0, "2024-05-09", "104"),
                new MenuItem(12L, "Lasagna", 280.0, "2024-05-14", "104"),
                new MenuItem(13L, "Chicken Wrap", 180.0, "2024-05-06", "105"),
                new MenuItem(14L, "Veggie Wrap", 160.0, "2024-05-11", "105"),
                new MenuItem(15L, "Fish and Chips", 220.0, "2024-05-15", "105"),
                new MenuItem(16L, "Classic Hot Dog", 130.0, "2024-05-16", "106"),
                new MenuItem(17L, "Chili Cheese Dog", 150.0, "2024-05-17", "106"),
                new MenuItem(18L, "Veggie Dog", 120.0, "2024-05-18", "106"),
                new MenuItem(19L, "Vanilla Milkshake", 100.0, "2024-05-19", "107"),
                new MenuItem(20L, "Chocolate Milkshake", 110.0, "2024-05-20", "107")
        );
    }

    @Override
    public List<MenuItem> getAllMenuItems() {
        return menuItems;
    }

    @Override
    public List<MenuItem> getMenuItemsByCategory(String category) {
        return menuItems.stream()
                .filter(item -> item.getCategoryId().equals(category))
                .collect(Collectors.toList());
    }
}
