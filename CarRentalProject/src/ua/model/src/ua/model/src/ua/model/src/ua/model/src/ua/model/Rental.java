package ua.model;

import java.time.LocalDate;
import java.util.Objects;

public class Rental {
    private Car car;
    private Customer customer;
    private LocalDate startDate;
    private LocalDate endDate;

    public Rental(Car car, Customer customer, LocalDate startDate, LocalDate endDate) {
        if (car == null || customer == null || startDate == null || endDate == null) {
            throw new IllegalArgumentException("Rental fields required");
        }
        this.car = car;
        this.customer = customer;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public static Rental of(Car car, Customer customer, LocalDate startDate, LocalDate endDate) {
        return new Rental(car, customer, startDate, endDate);
    }

    @Override
    public String toString() {
        return String.format("Rental[%s -> %s from %s to %s]", customer, car, startDate, endDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rental)) return false;
        Rental rental = (Rental) o;
        return Objects.equals(car, rental.car) && Objects.equals(customer, rental.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, customer);
    }
}
