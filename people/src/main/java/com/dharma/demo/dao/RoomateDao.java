package com.dharma.demo.dao;

import com.dharma.demo.entity.Roomate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface RoomateDao extends JpaRepository<Roomate,Long> {
    @Query(value = "select r.id,r.name,b.grade,r.sex from roomate r inner join brother b on r.pid=b.id",nativeQuery = true)
    List<Map<String, Object>> getBrother();


    @Query(value = "select r.id,r.name,b.grade,r.sex from roomate r inner join brother b on r.pid=b.id and r.id=?",nativeQuery = true)
    List<Map<String, Object>> getBrotherById(Integer id);
}
