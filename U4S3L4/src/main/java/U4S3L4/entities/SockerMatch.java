package U4S3L4.entities;

import U4S3L4.enums.EventType;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "socker_matches")
public class SockerMatch extends Event{

    @Column(name = "home_squad")
    private String homeSquad;

    @Column(name = "guest_squad")
    private String guestSquad;

    @Column(name = "winner_squad")
    private String winnerSquad;

    @Column(name = "home_squad_goals")
    private short homeSquadGoals;

    @Column(name = "guest_squad_goals")
    private short guestSquadGoals;




    public SockerMatch() {}

    public SockerMatch(String title, LocalDate eventDt, String description, EventType eventType, int nrMaxPartecipants, Location location, String homeSquad, String guestSquad, String winnerSquad, short homeSquadGoals, short guestSquadGoals) {
        super(title, eventDt, description, eventType, nrMaxPartecipants, location);
        this.homeSquad = homeSquad;
        this.guestSquad = guestSquad;
        this.winnerSquad = winnerSquad;
        this.homeSquadGoals = homeSquadGoals;
        this.guestSquadGoals = guestSquadGoals;
    }

    public String getHomeSquad() {
        return homeSquad;
    }

    public void setHomeSquad(String homeSquad) {
        this.homeSquad = homeSquad;
    }

    public String getGuestSquad() {
        return guestSquad;
    }

    public void setGuestSquad(String guestSquad) {
        this.guestSquad = guestSquad;
    }

    public String getWinnerSquad() {
        return winnerSquad;
    }

    public void setWinnerSquad(String winnerSquad) {
        this.winnerSquad = winnerSquad;
    }

    public short getHomeSquadGoals() {
        return homeSquadGoals;
    }

    public void setHomeSquadGoals(short homeSquadGoals) {
        this.homeSquadGoals = homeSquadGoals;
    }

    public short getGuestSquadGoals() {
        return guestSquadGoals;
    }

    public void setGuestSquadGoals(short guestSquadGoals) {
        this.guestSquadGoals = guestSquadGoals;
    }
}
