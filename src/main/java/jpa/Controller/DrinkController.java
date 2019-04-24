package jpa.Controller;

import jpa.model.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jpa.service.DrinkService;

import java.util.List;

@RestController
public class DrinkController {
    @Autowired
    DrinkService drinkService;

    @RequestMapping(value = "/",method = RequestMethod.GET,produces="text/html;charset=UTF-8")
    public @ResponseBody String welcome(){
        return "欢迎来到夜雨听风商贸城";
    }

    @GetMapping("/drink")
    public @ResponseBody
    List<Drink> getAllDrinks(){
        return drinkService.getAllDrinks();
    }
    @GetMapping("/drink/id/{id}")
    public @ResponseBody
    Drink getDrinkById(@PathVariable Long id){
        return drinkService.getById(id);
    }

    @GetMapping("/drink/name/{name}")
    public @ResponseBody
    List<Drink> getAllDrinksByName(@PathVariable String name){
        return drinkService.getDrinksBy(name);
    }
    @PostMapping("/drink")
    public HttpStatus insertDrink(@PathVariable Drink drink){
        return drinkService.addDrink(drink)?HttpStatus.CREATED:HttpStatus.BAD_REQUEST;
    }
    @DeleteMapping("/drink")
    public HttpStatus deleteDrink(@PathVariable Long id){
        drinkService.deleteDrink(id);
        return HttpStatus.NO_CONTENT;
    }
}
