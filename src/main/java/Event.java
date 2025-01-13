import java.util.Objects;

public class Event {
    String title;
    String date;
    String notes;
    boolean bunting;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isBunting() {
        return bunting;
    }

    public void setBunting(boolean bunting) {
        this.bunting = bunting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return bunting == event.bunting && Objects.equals(title, event.title) && Objects.equals(date, event.date) && Objects.equals(notes, event.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, date, notes, bunting);
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", notes='" + notes + '\'' +
                ", bunting=" + bunting +
                '}';
    }


}
