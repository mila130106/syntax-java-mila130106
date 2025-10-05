package ua;

import ua.model.*;
import ua.model.enums.*;
import ua.util.Utils;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Car Rental Demo (record + enum + switch) ===");

        Customer customer = new Customer("Ivan", "Petrenko", "DL123456", LocalDate.of(1990, 5, 12));
        Branch branch = new Branch("Central", "Kyiv");

        CarStatus status = CarStatus.AVAILABLE;
        PaymentMethod method = PaymentMethod.CREDIT_CARD;

        System.out.println(customer);
        System.out.println(branch);

        System.out.println(Utils.statusMessage(status));

        double price = 2500.00;
        double discounted = Utils.applyDiscount(price, method);
        System.out.printf("Price: %.2f, after %s discount: %.2f%n", price, method, discounted);
    }
}
