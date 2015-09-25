package quizr.domain;

public class Answer {
    public String participantId;
    public int answerIndex;

    public Answer(String participantId, int answerIndex) {
        this.participantId = participantId;
        this.answerIndex = answerIndex;
    }
}
