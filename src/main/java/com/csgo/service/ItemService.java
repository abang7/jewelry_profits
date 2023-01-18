package com.csgo.service;

import com.csgo.entity.Item;

public interface ItemService {
    Item get(Long id);
    Item search(String itemCategory);
    String add(Item item);
    Double getRent(Long id);
}
