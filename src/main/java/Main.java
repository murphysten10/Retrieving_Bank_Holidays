import java.time.*;
public class Main {
    public static void main(String[] args) throws Exception {
        LocalDate date = LocalDate.now();
        Event event = new Event();
        EventClient client = new EventClient();
        client.syncJackson(date);
    }

}
