package Question.Springboot.controller;

import java.util.*;
import Question.Springboot.service.Question;
import Question.Springboot.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")

public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestion")

    public List<Question> getAllQuestion(){
        return questionService.getAllQuestion();
    }

    @GetMapping("Category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }

}
