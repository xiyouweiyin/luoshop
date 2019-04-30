package com.dharma.demo.service;

import com.dharma.demo.dao.RoomateDao;
import com.dharma.demo.entity.Roomate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoomateService {
    @Autowired
    private RoomateDao roomateDao;


    public List<Roomate> getAll() {
        return roomateDao.findAll();
    }

    public List<Map<String, Object>> getBrother() {
        return roomateDao.getBrother();
    }

    public List<Map<String, Object>> getBrother(Integer id) {
        return roomateDao.getBrotherById(id);
    }
}
