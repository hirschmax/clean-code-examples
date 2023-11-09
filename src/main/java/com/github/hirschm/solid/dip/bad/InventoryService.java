package com.github.hirschm.solid.dip.bad;

import com.github.hirschm.solid.dip.Item;

public class InventoryService {
    private final DatabaseService databaseService;
    public InventoryService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
    void store(Item item) {
        databaseService.save(item);
    }
    Item findItem(String id) {
        return databaseService.find(id);
    }
}
