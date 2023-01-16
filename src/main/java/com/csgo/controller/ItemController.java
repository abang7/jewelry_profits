package com.csgo.controller;

import com.csgo.dao.ItemRepository;
import com.csgo.service.ItemService;
import com.csgo.service.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @Autowired
    private LeaseService leaseService;
    @GetMapping("/get")
    public String get(){
        return itemService.get(2L).toString();
    }

}
