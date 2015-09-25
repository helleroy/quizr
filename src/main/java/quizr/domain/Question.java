package quizr.domain;

import java.util.List;

public class Question {
    public String questionText;
    public List<String> alternatives;
    public int correctAnswer;
    public int timeLimit;

    public boolean isAnswerCorrect(int answerIndex) {
        return correctAnswer == answerIndex;
    }
}
