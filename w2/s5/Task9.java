import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Event {
    String name;
    LocalDate date;

    Event(String name, String date) {
        this.name = name;
        this.date = LocalDate.parse(date);
    }

    public LocalDate getDate() { return date;}
    public String getName() { return name; }
}

// first, sort all events chronologically by date;
//  second, determine the earliest and latest events in the list;
//  and third, given a month number, identify all events that occur in that specific month. 

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of events: ");
        int n = Integer.parseInt(sc.nextLine());

        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            events.add(new Event(sc.nextLine(), sc.nextLine()));
        }

        System.out.print("Target month: ");
        int targetMonth = sc.nextInt();
        sc.close();

        // first part
        List<Event> sortedEvents = events.stream()
                                    .sorted(Comparator.comparing(Event::getDate))
                                    .collect(Collectors.toList());

        System.out.println(
            sortedEvents.stream()
                        .map(Event::getName)
                        .collect(Collectors.joining(" "))
        );

        // second part
        System.out.println("Earliest Event: " + sortedEvents.get(0).getName());
        System.out.println("Latest Event: " + sortedEvents.get(n - 1).getName());

        // third part
        sortedEvents.stream()
                    .filter(event -> event.getDate().getMonthValue() == targetMonth)
                    .map(Event::getName)
                    .forEach(System.out::println);
    }
}
