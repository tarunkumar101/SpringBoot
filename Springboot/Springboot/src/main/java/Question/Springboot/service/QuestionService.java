package Question.Springboot.service;

import Question.Springboot.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestion() {
        return questionDao.findAll();

    }

    public List<Question> getQuestionByCategory(String category) {
        return questionDao.findByCategory(category);
    }
}
