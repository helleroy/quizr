package quizr.domain;

import quizr.dto.AnswerDTO;

import java.util.*;

public class Quiz {
    private final Map<UUID, Participant> participants;
    private final List<Question> questions;
    private Iterator<Question> iterator;
    private Question currentQuestion;

    public Quiz(List<Question> questions, Map<UUID, Participant> participants) {
        this.questions = questions;
        this.participants = participants;

        this.iterator = questions.iterator();
    }

    public void evaluateAnswer(Answer answer) {
        Participant participant = participants.get(UUID.fromString(answer.participantId));
        if (currentQuestion.isAnswerCorrect(answer.answerIndex)) {
            participant.incrementScore();
        }
    }

    public Participant addParticipant(UUID uuid) {
        return participants.getOrDefault(uuid, new Participant());
    }

    public Optional<Question> nextQuestion() {
        if (iterator.hasNext()) {
            currentQuestion = iterator.next();
            return Optional.of(currentQuestion);
        }
        return Optional.empty();
    }

    public Map<UUID, Participant> getParticipants() {
        return participants;
    }

    public Question getCurrentQuestion() {
        return currentQuestion;
    }
}
