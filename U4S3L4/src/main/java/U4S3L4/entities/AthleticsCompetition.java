package U4S3L4.entities;

import U4S3L4.enums.EventType;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "athletics_competitions")
public class AthleticsCompetition extends Event {

    @OneToOne
    @JoinColumn(name = "winner_participation_id")
    private Partecipation winner;

    @OneToMany
    @JoinColumn(name = "participant_list")
    private List<Partecipation> participants;

    public AthleticsCompetition() {}

    public AthleticsCompetition(String title, LocalDate eventDt, String description, EventType eventType, int nrMaxPartecipants, Location location, Partecipation winner, List<Partecipation> participants) {
        super(title, eventDt, description, eventType, nrMaxPartecipants, location);
        this.winner = winner;
        this.participants = participants;
    }

    public Partecipation getWinner() {
        return winner;
    }

    public void setWinner(Partecipation winner) {
        this.winner = winner;
    }

    public List<Partecipation> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Partecipation> participants) {
        this.participants = participants;
    }
}
