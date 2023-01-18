package com.csgo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
public class LeaseOrder {
    @Id
    Long Id;
    Date leaseTime;
    Double rent;
}
