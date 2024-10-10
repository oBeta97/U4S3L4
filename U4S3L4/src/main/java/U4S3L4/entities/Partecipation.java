package U4S3L4.entities;

import U4S3L4.enums.PartecipationStates;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "partecipations")
public class Partecipation {

    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;
    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;
    @Column(nullable = false)
    private PartecipationStates state;

    public Partecipation() {}

    public Partecipation(Person person, Event event, PartecipationStates state) {
        this.person = person;
        this.event = event;
        this.state = state;
    }

    public UUID getId() {
        return id;
    }

    private void setId(UUID id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public PartecipationStates getState() {
        return state;
    }

    public void setState(PartecipationStates state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Partecipation{" +
                "id=" + id +
                ", person=" + person +
                ", event=" + event +
                ", state=" + state +
                '}';
    }
}
