package com.csgo.service.impl;

import com.csgo.dao.ItemRepository;
import com.csgo.entity.Item;
import com.csgo.entity.LeaseOrder;
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

    @Override
    public Item search(String itemCategory) {
        return itemRepository.findItemByItemsCategory(itemCategory);
    }

    @Override
    public String add(Item item) {
        itemRepository.save(item);
        return "加入"+ item.toString();
    }

    @Override
    public Double getRent(Long id) {
        Double total = 0.0;
        for (LeaseOrder o:
                itemRepository.findOne(id).getLeaseOrder()
        ){
            total +=o.getRent();
        }
        return total;
    }

}
