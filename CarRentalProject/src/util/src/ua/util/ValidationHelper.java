package ua.util;

class ValidationHelper {
    static boolean isStringValid(String s) {
        return s != null && !s.isBlank();
    }

    static boolean isPositive(int number) {
        return number > 0;
    }

    static boolean isPositiveDouble(double number) {
        return number > 0.0;
    }
}
