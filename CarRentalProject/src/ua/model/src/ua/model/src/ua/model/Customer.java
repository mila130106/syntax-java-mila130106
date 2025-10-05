package ua.model;

import java.time.LocalDate;

public record Customer(String firstName, String lastName, String driverLicense, LocalDate birthDate) {

    public Customer {
        if (firstName == null || lastName == null || driverLicense == null || birthDate == null) {
            throw new IllegalArgumentException("Customer fields cannot be null");
        }
    }

    @Override
    public String toString() {
        return "Customer[firstName=%s, lastName=%s, driverLicense=%s, birthDate=%s]"
                .formatted(firstName, lastName, driverLicense, birthDate);
    }
}
