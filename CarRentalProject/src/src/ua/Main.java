package ua;

import ua.model.*;
import ua.model.enums.CarStatus;
import ua.model.enums.PaymentMethod;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Запуск Car Rental Demo");

        Car car = Car.of("AA1234BB", "Toyota Corolla", 2020, 50000, CarStatus.AVAILABLE);
        Customer customer = Customer.of("Ivan", "Petrenko", "DL123456", LocalDate.of(1990, 5, 12));
        Branch branch = Branch.of("Central", "Kyiv");

        Rental rental = Rental.of(car, customer, LocalDate.now(), LocalDate.now().plusDays(5));
        Payment payment = Payment.of(rental, 2500.0, LocalDate.now(), PaymentMethod.CREDIT_CARD);

        System.out.println(car);
        System.out.println(customer);
        System.out.println(branch);
        System.out.println(rental);
        System.out.println(payment);

        // приклад помилки валідації
        try {
            Car bad = new Car("", "X", 1970, -5, CarStatus.AVAILABLE);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
