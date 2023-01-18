package com.csgo.service;

import com.csgo.entity.Item;
import org.springframework.data.jpa.repository.Query;

public interface LeaseService {
    Double totalRent();
}
