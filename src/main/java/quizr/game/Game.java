package quizr.game;

import org.springframework.stereotype.Component;
import quizr.domain.Answer;
import quizr.domain.Participant;
import quizr.domain.Quiz;

import java.util.UUID;

@Component
public class Game {

    public Quiz currentQuiz;

    public void newQuiz(Quiz quiz) {
        this.currentQuiz = quiz;
    }

    public void evaluateAnswer(Answer answer) {
        currentQuiz.evaluateAnswer(answer);
    }

    public Participant addParticipant(UUID uuid) {
        return currentQuiz.addParticipant(uuid);
    }

}
