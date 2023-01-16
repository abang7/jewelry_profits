package com.csgo.service.impl;

import com.csgo.dao.ItemRepository;
import com.csgo.entity.Item;
import com.csgo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;
    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }
    @Override
    public Item get(Long id) {
        return itemRepository.findOne(id);
    }

}
