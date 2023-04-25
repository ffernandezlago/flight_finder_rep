package org.example;

import java.time.Month;
import java.util.List;

public class Search {
    private List<String> from;
    private List<String> to;
    private Month month;
    private List<Flight> foundFlights;

    public Search(List<String> from, List<String> to, Month month) {
        this.from = from;
        this.to = to;
        this.month = month;
    }

    public List<Flight> runSearch(List<Flight> flights) {
        foundFlights = flights.stream()
                .filter( x -> x.month().equals(this.month))
                .filter( x -> this.from.contains(x.from()))
                .filter( x -> this.to.contains(x.to()))
                .toList();
        return foundFlights;
    }

    @Override
    public String toString() {
        String foundFlightString = "";
        for (Flight foundFlight: foundFlights) {
            foundFlightString += foundFlight.toString() + "\n";
        }
        return String.format("These are the values matching the search criteria:%n %s", foundFlightString);
    }
}
