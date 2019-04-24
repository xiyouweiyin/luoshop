package jpa.Controller;

import jpa.model.Study;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jpa.service.StudyService;

import java.util.List;

@RestController
public class StudyController {
    @Autowired
    StudyService studyService;

    @GetMapping("/study")
    public @ResponseBody
    List<Study> getAllFoods(){
        return studyService.getAllStudys();
    }
}
