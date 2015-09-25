package quizr.dto;

import java.util.List;

public class QuestionDTO {
    public String questionText;
    public List<String> alternatives;

    public QuestionDTO(String questionText, List<String> alternatives) {
        this.questionText = questionText;
        this.alternatives = alternatives;
    }
}
