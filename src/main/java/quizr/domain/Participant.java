package quizr.domain;

import java.util.UUID;

public class Participant {

    public final UUID id;
    private int score;

    public Participant() {
        this.id = UUID.randomUUID();
        score = 0;
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}
