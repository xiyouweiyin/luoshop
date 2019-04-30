package com.dharma.demo.controller;

import com.dharma.demo.entity.Roomate;
import com.dharma.demo.service.RoomateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/roomate")
public class RoomateController {
    @Autowired
    private RoomateService roomateService;
    @GetMapping("/all")
    public List<Roomate> getAll(){
        return roomateService.getAll();
    }
    @GetMapping("/brother")
    public List<Map<String,Object>>getBrother(){
        return roomateService.getBrother();
    }
    @GetMapping("/brotherId/{id}")
    public List<Map<String,Object>>getBrotherById(@PathVariable Integer id){
        return roomateService.getBrother(id);
    }
}
