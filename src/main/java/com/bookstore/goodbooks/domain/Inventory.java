package com.bookstore.goodbooks.domain;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "Inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int inventory_id;
    @Column(name = "inventory_type")
    private String inventory_type;
    @Column(name = "inventory_description")
    private String inventory_description;
    @Column(name = "inventory_items")
    private String inventory_items;
    @Column(name = "inventory_number")
    private String inventory_number;

}
