package com.syarif.store.controller;

import com.syarif.store.model.ItemMaster;
import com.syarif.store.repository.ItemRepository;
import com.syarif.store.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/master/item")
public class ItemController {

    @Autowired
    private ItemService itemService;
    private Logger logger = LoggerFactory.getLogger("item master");

    @GetMapping("/all")
    public List<ItemMaster> findAll(){
        return itemService.findAll();
    }

    @GetMapping("/find/{id}")
    public ItemMaster findById(@PathVariable String id){
        return itemService.findById(id);
    }

    @PostMapping
    public ItemMaster create(@RequestBody ItemMaster toDo){
        return itemService.save(toDo);
    }

    @PutMapping("/{id}")
    public ItemMaster update(@RequestBody ItemMaster toDo){
        return itemService.save(toDo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        itemService.deleteById(id);
    }
}
