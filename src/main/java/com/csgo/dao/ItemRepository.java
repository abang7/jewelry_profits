package com.csgo.dao;

import com.csgo.entity.Item;
import com.csgo.entity.LeaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    Item findItemByItemsCategory(String itemCategory);
}
