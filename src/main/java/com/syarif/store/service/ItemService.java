package com.syarif.store.service;

import com.syarif.store.model.ItemMaster;
import com.syarif.store.repository.ItemRepository;
import com.syarif.store.util.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<ItemMaster> findAll(){
        return itemRepository.findAll();
    }

    public ItemMaster findById(String id){
        return itemRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public ItemMaster save(ItemMaster itemMaster){
        return itemRepository.save(itemMaster);
    }

    public void deleteById(String id){
        itemRepository.deleteById(id);
    }

}
