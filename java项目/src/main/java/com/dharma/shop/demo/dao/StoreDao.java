package com.dharma.shop.demo.dao;

import com.dharma.shop.demo.entity.Tb_store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StoreDao extends JpaRepository<Tb_store,Integer> {
    @Query(value = "select d.id,d.name,d.price,t.address,t.tel from dm_shop d inner join tb_store t on d.store_id=t.id",nativeQuery = true)
    List<Map<String, Object>> findShopMsg();

    @Query(value = "select d.id,d.name,d.price,t.address,t.tel from dm_shop d inner join tb_store t on d.store_id=t.id and d.id=?",nativeQuery = true)
    List<Map<String, Object>> findShopMsgByzId(Integer id);
}
