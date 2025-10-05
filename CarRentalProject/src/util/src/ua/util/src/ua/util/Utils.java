package ua.util;

import ua.model.enums.CarStatus;
import ua.model.enums.PaymentMethod;

public class Utils {

    public static String statusMessage(CarStatus status) {
        return switch (status) {
            case AVAILABLE -> "Car is available for rent.";
            case RENTED -> "Car is currently rented.";
            case MAINTENANCE -> "Car is under maintenance.";
            case RESERVED -> "Car has been reserved.";
        };
    }

    public static double applyDiscount(double amount, PaymentMethod method) {
        return switch (method) {
            case CREDIT_CARD -> amount * 0.95;
            case DEBIT_CARD -> amount * 0.97;
            case CASH -> amount;
            case ONLINE -> amount * 0.9;
        };
    }
}
