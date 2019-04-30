package com.dharma.shop.demo.service;

import com.dharma.shop.demo.dao.StoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class StoreService {
    @Autowired
    private StoreDao storeDao;
    public List<Map<String, Object>> getShopMsg() {
        return storeDao.findShopMsg();
    }

    public List<Map<String, Object>> getShopMsgById(Integer id) {
        return storeDao.findShopMsgByzId(id);
    }
}
