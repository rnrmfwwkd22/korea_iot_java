package org.example.chapter10.Practice02.service;

import org.example.chapter10.Practice02.entity.Item;

import java.util.List;

public interface InventoryService {

    void addItem(Item item);

    List<Item> getItemsByCatefory(String category);

    void updateItemPrice(String itemId, int newprice);

    void deleteItem(String itemId);
}
