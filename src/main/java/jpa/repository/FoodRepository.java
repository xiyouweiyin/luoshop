package jpa.repository;

import jpa.model.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food,Long> {
}
