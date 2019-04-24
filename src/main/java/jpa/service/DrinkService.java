package jpa.service;

import jpa.model.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import jpa.repository.DrinkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService {
    @Autowired
    DrinkRepository drinkRepository;
    public List<Drink> getAllDrinks() {
        return (List<Drink>)drinkRepository.findAll();
    }

    public Drink getById(Long id) {
         return drinkRepository.findOne(id);
    }

    public List<Drink> getDrinksBy(String name) {
        return (List<Drink>) drinkRepository.findByname(name);
    }

    public boolean addDrink(Drink drink) {
        return drinkRepository.save(drink)!=null;
    }
    public void deleteDrink(Long id) {
        drinkRepository.delete(id);
    }
}
