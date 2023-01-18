package com.csgo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Table(name = "item")
@Entity

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String itemsCategory;
    String family;
    String wear;
    double purchasePrice;
    Date purchaseTime;
    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "item_id")
    List<LeaseOrder> leaseOrder;

}
