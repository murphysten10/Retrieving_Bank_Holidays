import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.time.*;

import static java.util.Comparator.comparing;

public class EventClient {
    ObjectMapper mapper = new ObjectMapper();


    public String govApiRequest() throws Exception{
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().
            uri(URI.create("https://www.gov.uk/bank-holidays.json")).
            build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    return response.body();
    }

    public void syncJackson(LocalDate today) throws Exception{

        String response = govApiRequest();
        BankHolidayData data = mapper.readValue(response, BankHolidayData.class);
//        List<Event> events = data.getEnglandAndWales().getEvents();
//        ArrayList<Event> filteredEvents = new ArrayList<>();
        data.getEnglandAndWales().getEvents().stream()
                .sorted(comparing(event -> event.date)).
                dropWhile(event -> LocalDate.parse(event.date).isBefore(today))
                .limit(5)
                .map(event -> event.date + " " + event.title)
                .forEach(System.out::println);


//        for (var event: events){
//            if (filteredEvents.size() == 5) {
//                break;
//            }
//            LocalDate eventDate = LocalDate.parse(event.getDate());
//            if (eventDate.isBefore(today)) {
//                continue;
//            }
//            filteredEvents.add(event);
//        }
//        return filteredEvents;
    }
}
