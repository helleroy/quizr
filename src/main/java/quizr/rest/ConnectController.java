package quizr.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quizr.domain.Participant;
import quizr.dto.ConnectDTO;
import quizr.game.Game;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@RestController
public class ConnectController {

    public static final String PARTICIPANT_ID_COOKIE = "participant-id";

    @Autowired
    private Game game;

    @RequestMapping(value = "/connect", method = RequestMethod.POST)
    public ConnectDTO connect(@RequestBody ConnectDTO connectDTO,
                              @CookieValue(value = PARTICIPANT_ID_COOKIE, required = false) String participantId,
                              HttpServletResponse response) {

        UUID uuid = participantId == null ? UUID.randomUUID() : UUID.fromString(participantId);

        Participant participant = game.addParticipant(uuid, connectDTO.participantName);
        response.addCookie(new Cookie(PARTICIPANT_ID_COOKIE, participant.id.toString()));

        return new ConnectDTO(participant.id.toString(), participant.name);
    }
}
