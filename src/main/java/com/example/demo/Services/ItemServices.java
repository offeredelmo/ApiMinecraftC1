package com.example.demo.Services;

import com.example.demo.Entities.Item;
import com.example.demo.Repositories.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServices {

    @Autowired
    private IItemRepository iItemRepository;

    public List<Item> getItem(){
        return iItemRepository.findAll();
    }

    public Item add(Item item){
        return iItemRepository.save(item);
    }

    public Item modify(Item item){
        Item modify = iItemRepository.findById(item.getId());
        modify.setName(item.getName());
        modify.setStack(item.getStack());
        modify.setDescription(item.getDescription());
        return iItemRepository.save(modify);
    }

}
