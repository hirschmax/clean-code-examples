package com.github.hirschm.solid.dip.good;

import com.github.hirschm.solid.dip.Item;

public class InventoryService {
    private final StorageService storageService;
    public InventoryService(StorageService storageService) {
        this.storageService = storageService;
    }
    void store(Item item) {
        storageService.save(item);
    }

    Item find(String itemId) {
        return storageService.find(itemId);
    }
}
