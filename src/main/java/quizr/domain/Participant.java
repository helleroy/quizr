package quizr.domain;

import java.util.UUID;

public class Participant {

    public final UUID id;
    public final String name;
    private int score;

    public Participant(String name) {
        this.name = name;
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
