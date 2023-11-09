package com.github.hirschm.solid.dip.good;

import com.github.hirschm.solid.dip.Item;

public class DatabaseService implements StorageService {
    @Override
    public void save(Item item) {

    }
    @Override
    public Item find(String itemId) {
        return new Item(itemId, "Hello World");
    }
}
