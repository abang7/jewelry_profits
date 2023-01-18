package com.csgo.service.impl;

import com.csgo.dao.LeaseRepository;
import com.csgo.entity.Item;
import com.csgo.entity.LeaseOrder;
import com.csgo.service.LeaseService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeaseServiceImpl implements LeaseService {
    private LeaseRepository leaseRepository;
    public LeaseServiceImpl(LeaseRepository leaseRepository){
        this.leaseRepository = leaseRepository;
    }
    @Override

    public Double totalRent(){
        double totalPrice = 0;
        for (LeaseOrder leaseOrder :leaseRepository.findAll()) {
            totalPrice += leaseOrder.getRent();
        }
        return totalPrice;

    }

//    @Override
//    public Double getRent() {
//        double totalRent = 0;
//        for (LeaseOrder o:
//                leaseRepository.findLeaseOrderByItem_Id(1L)) {
//            totalRent += o.getRent();
//        }
//        return totalRent;
//    }

}
