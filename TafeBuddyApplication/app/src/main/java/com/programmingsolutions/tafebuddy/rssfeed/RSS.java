package com.programmingsolutions.tafebuddy.rssfeed;

import java.util.List;

/**
 * Created by Matthew Shinkfield on 10/29/2016.
 */

public class RSS {

    public final String name;
    public final String link;
    public final String description;
    public List<String> categories;
    public List<RSS_Item> items;

    public RSS(String name, String link, String description) {
        this.name = name;
        this.link = link;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public void addCategory(String category) {
        this.categories.add(category);
    }

    public List<RSS_Item> getItems() {
        return items;
    }

    public void setItems(List<RSS_Item> items) {
        this.items = items;
    }

    public void addItem(RSS_Item item) {
        this.items.add(item);
    }
}
