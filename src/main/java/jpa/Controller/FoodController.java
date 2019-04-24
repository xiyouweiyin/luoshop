package jpa.Controller;

import jpa.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jpa.service.FoodService;

import java.util.List;

@RestController
public class FoodController {
    @Autowired
    FoodService foodService;

    @GetMapping("/food")
    public @ResponseBody
    List<Food>getAllFoods(){
        return foodService.getAllFoods();
    }
}
