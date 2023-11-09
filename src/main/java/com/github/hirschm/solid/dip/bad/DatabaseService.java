package com.github.hirschm.solid.dip.bad;

import com.github.hirschm.solid.dip.Item;

public class DatabaseService {
    void save(Item item) {

    }
    Item find(String id) {
        return new Item(id, "");
    }
}
