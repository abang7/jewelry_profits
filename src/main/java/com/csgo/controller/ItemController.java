package com.csgo.controller;

import com.csgo.dao.ItemRepository;
import com.csgo.entity.Item;
import com.csgo.service.ItemService;
import com.csgo.service.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/get")
    public Double getRent(){
        return itemService.getRent(1L);
    }
    @GetMapping("/search")
    public String search(){
        return itemService.search("刺刀").toString();
    }
    @PostMapping("/add")
    public String add(@Valid @RequestBody Item item){
        return itemService.add(item);
    }
}
