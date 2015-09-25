package quizr.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import quizr.domain.Answer;
import quizr.dto.AnswerDTO;
import quizr.game.Game;

@Controller
public class AnswerController {

    @Autowired
    private Game game;

    @MessageMapping("/message/answer")
    @SendTo("/admin/answer")
    public AnswerDTO relayAnswer(AnswerDTO answerDTO) {
        game.evaluateAnswer(new Answer(answerDTO.participantId, answerDTO.answerIndex));

        return answerDTO;
    }
}
