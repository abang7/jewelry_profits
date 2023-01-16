package com.csgo.service.impl;

import com.csgo.dao.LeaseRepository;
import com.csgo.entity.Item;
import com.csgo.service.LeaseService;
import org.springframework.stereotype.Service;

@Service
public class LeaseServiceImpl implements LeaseService {
    private LeaseRepository leaseRepository;
    public LeaseServiceImpl(LeaseRepository leaseRepository){
        this.leaseRepository = leaseRepository;
    }
    @Override
    public Double totalRent(Item item) {
        return 10.0;

    }
}
