package U4S3L4.entities;

import U4S3L4.enums.EventGenre;
import U4S3L4.enums.EventType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "concerts")
public class Concert extends Event{
    @Enumerated(EnumType.STRING)
    private EventGenre genre;
    private boolean streaming;

    public Concert() {}

    public Concert(String title, LocalDate eventDt, String description, EventType eventType, int nrMaxPartecipants, Location location, EventGenre genre, boolean streaming) {
        super(title, eventDt, description, eventType, nrMaxPartecipants, location);
        this.genre = genre;
        this.streaming = streaming;
    }

    public EventGenre getGenre() {
        return genre;
    }

    public void setGenre(EventGenre genre) {
        this.genre = genre;
    }

    public boolean isStreaming() {
        return streaming;
    }

    public void setStreaming(boolean streaming) {
        this.streaming = streaming;
    }
}
