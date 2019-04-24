package jpa.service;

import jpa.model.Study;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jpa.repository.StudyRepository;

import java.util.List;

@Service
public class StudyService {
    @Autowired
    StudyRepository studyRepository;
    public List<Study> getAllStudys(){
        return (List<Study>) studyRepository.findAll();
    }
}
