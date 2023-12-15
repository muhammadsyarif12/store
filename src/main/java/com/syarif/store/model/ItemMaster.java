package com.syarif.store.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="item_master")
public class ItemMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private Integer itemId;

    @Column(name="item_name")
    private String itemName;

    @Column(name = "item_description")
    private String itemDescription;
}
