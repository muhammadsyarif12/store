package com.syarif.store.repository;

import com.syarif.store.model.ItemMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<ItemMaster, String> {
    public Optional<ItemMaster> findByItemId(Integer itemId);
}
