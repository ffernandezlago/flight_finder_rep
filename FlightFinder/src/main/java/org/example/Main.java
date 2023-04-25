package org.example;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Flight> flights = new ArrayList();
        flights.add( new Flight (
                "Ryanair", 123,
                LocalDateTime.of(2023, 03, 23, 12, 25),
                "OPO", "ZRH"));

        flights.add( new Flight (
                "Ryanair", 123,
                LocalDateTime.of(2023, 03, 23, 12, 25),
                "OPO", "GVA"));

        flights.add( new Flight (
                "Ryanair", 125,
                LocalDateTime.of(2023, 03, 24, 12, 25),
                "OPO", "MIL"));

        flights.add( new Flight (
                "Ryanair", 123,
                LocalDateTime.of(2023, 03, 23, 12, 25),
                "ZRH", "LCG"));

        flights.add( new Flight (
                null, 123,
                null,
                "ZRH", "LCG"));

        Search search = new Search(
                new ArrayList<String>(Arrays.asList("SCQ","OPO","VGO","LCG")),
                new ArrayList<String>(Arrays.asList("ZRH","GVA","BSL")),
                Month.MARCH);

        search.runSearch(flights);
        System.out.println(search);
    }
}