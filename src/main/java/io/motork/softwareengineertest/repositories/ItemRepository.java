package io.motork.softwareengineertest.repositories;

import io.motork.softwareengineertest.entities.Item;

import java.util.List;

public class ItemRepository extends BaseRepository<Item> {

    public void save(Item item) {
        // Save the item to the database
    }

    public Item findById(String id) {
        // Find the item by id from the database
        return null;
    }

    public void update(Item item) {
        // Update the item in the database
    }

    public void delete(Item item) {
        // Delete the item from the database
    }

    public List<Item> findAll() {
        // Find all items from the database
        return null;
    }
}
