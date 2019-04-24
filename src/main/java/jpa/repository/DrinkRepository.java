package jpa.repository;

import jpa.model.Drink;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DrinkRepository extends CrudRepository<Drink,Long> {

    List<Drink> findByname(String name);
}
