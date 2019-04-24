package jpa.repository;

import jpa.model.Study;
import org.springframework.data.repository.CrudRepository;

public interface StudyRepository extends CrudRepository<Study,Long> {
}
