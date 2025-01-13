import java.time.LocalDate;
import java.util.List;

public class DivisionData {

    private String division;
    private List<Event> events;

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
