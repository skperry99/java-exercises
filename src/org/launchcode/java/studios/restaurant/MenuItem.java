package org.launchcode.java.studios.restaurant;

import java.time.LocalDateTime;

/**
 * Created by Maggie on 3/13/2017.
 */
public class MenuItem {
    private double price = 0.0;
    private String description;
    private String category;
    private final LocalDateTime created = LocalDateTime.now();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}
