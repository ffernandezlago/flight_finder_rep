package org.example;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Optional;
import java.util.OptionalDouble;

public class Flight {
    private Optional<String> company;
    private Optional<LocalDateTime> dateAndTime;
    private Optional<String> from;
    private Optional<String> to;
    private double price;

    public Flight(String company, double price, LocalDateTime dateAndTime, String from, String to) {
        this.price = price;
        this.company = Optional.ofNullable(company);
        this.dateAndTime = Optional.ofNullable(dateAndTime);
        this.from = Optional.ofNullable(from);
        this.to = Optional.ofNullable(to);
    }

    public Month month(){ return dateAndTime.ifPresent( x -> x.getMonth()); }
    public Optional<String> from() {return from; }
    public Optional<String> to() {return to; }
    public double  price(){return price;}

    @Override
    public String toString() {
        return "Flight{" +
                "company='" + company + '\'' +
                ", price=" + price +
                ", dateAndTime=" + dateAndTime +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
