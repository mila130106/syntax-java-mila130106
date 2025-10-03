package ua.model;

import ua.model.enums.PaymentMethod;
import java.time.LocalDate;
import java.util.Objects;

public class Payment {
    private Rental rental;
    private double amount;
    private LocalDate paymentDate;
    private PaymentMethod method;

    public Payment(Rental rental, double amount, LocalDate paymentDate, PaymentMethod method) {
        if (rental == null) throw new IllegalArgumentException("Rental required");
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (paymentDate == null) throw new IllegalArgumentException("Payment date required");
        this.rental = rental;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.method = method;
    }

    public static Payment of(Rental rental, double amount, LocalDate paymentDate, PaymentMethod method) {
        return new Payment(rental, amount, paymentDate, method);
    }

    @Override
    public String toString() {
        return String.format("Payment[%.2f via %s on %s]", amount, method, paymentDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;
        Payment payment = (Payment) o;
        return Objects.equals(rental, payment.rental) && Double.compare(amount, payment.amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rental, amount);
    }
}
