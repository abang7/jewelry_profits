package com.csgo.dao;

import com.csgo.entity.Item;
import com.csgo.entity.LeaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaseRepository extends JpaRepository<LeaseOrder, Long> {

}
