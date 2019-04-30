package com.dharma.shop.demo.controller;

import com.dharma.shop.demo.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/shop")
public class StoreController {
    @Autowired
    private StoreService storeService;
    @GetMapping("/all")
    public List<Map<String,Object>>getShopMsg(){
        return  storeService.getShopMsg();
    }
    @GetMapping("/id/{id}")
    public List<Map<String,Object>>getShopMsgById(@PathVariable Integer id){
        return storeService.getShopMsgById(id);
    }


}
