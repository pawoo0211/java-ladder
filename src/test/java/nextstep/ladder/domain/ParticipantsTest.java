package nextstep.ladder.domain;

import nextstep.ladder.domain.participant.Participant;
import nextstep.ladder.domain.participant.Participants;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class ParticipantsTest {

    public static final Participant P1 = new Participant("kwon", 0);
    public static final Participant P2 = new Participant("muel", 1);

    @Test
    void 생성자() {
        String[] givenData = {"park", "sang", "kwom"};
        Participants participants = Participants.of(givenData);
        participants.getParticipantList()
                .stream()
                .forEach(participant ->  System.out.print(participant));
    }
}
