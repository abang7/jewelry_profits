package com.csgo.controller;

import com.csgo.service.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lease")
public class LeaseController {
    @Autowired
    private LeaseService leaseService;
    @GetMapping("/total")
    public Double totalRent(){
        return leaseService.totalRent();
    }
//    @GetMapping("/get")
//    public Double get(){
//        return leaseService.getRent();
//    }
}
