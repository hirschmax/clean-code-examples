package com.github.hirschm.solid.dip.good;

import com.github.hirschm.solid.dip.Item;

public interface StorageService {
    void save(Item item);
    Item find(String itemId);
}
