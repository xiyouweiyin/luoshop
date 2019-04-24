package jpa.service;

import jpa.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jpa.repository.FoodRepository;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    FoodRepository foodRepository;
    public List<Food> getAllFoods() {
        return (List<Food>)foodRepository.findAll();
    }
}
