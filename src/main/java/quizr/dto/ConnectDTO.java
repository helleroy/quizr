package quizr.dto;

public class ConnectDTO {

    public String participantId, participantName;

    public ConnectDTO() {
    }

    public ConnectDTO(String participantId, String participantName) {
        this.participantId = participantId;
        this.participantName = participantName;
    }
}
