package com.PiCafe.PiCafePos.entities;

public class MenuItem {
    private Long id;
    private String name;
    private double cost;
    private String launchDate;
    private String categoryId;

    public MenuItem() {
    }

    public MenuItem(Long id, String name, double cost, String launchDate, String categoryId) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.launchDate = launchDate;
        this.categoryId = categoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
