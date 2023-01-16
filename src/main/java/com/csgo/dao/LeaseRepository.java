package com.csgo.dao;

import com.csgo.entity.LeaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaseRepository extends JpaRepository<LeaseOrder, Long> {
}
