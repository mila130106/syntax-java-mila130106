package ua.model;

import java.time.LocalDate;

public record Customer(String firstName, String lastName, String driverLicense, LocalDate birthDate) {
    public Customer {
        if (firstName == null || firstName.isBlank()) throw new IllegalArgumentException("First name required");
        if (driverLicense == null || driverLicense.length() < 4) throw new IllegalArgumentException("Invalid driver license");
        if (birthDate == null) throw new IllegalArgumentException("Birth date required");
    }

    public static Customer of(String firstName, String lastName, String driverLicense, LocalDate birthDate) {
        return new Customer(firstName, lastName, driverLicense, birthDate);
    }
}
