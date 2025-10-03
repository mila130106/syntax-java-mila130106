package ua.util;

public class Utils {
    public static void checkString(String s) {
        if (!ValidationHelper.isStringValid(s)) {
            throw new IllegalArgumentException("Invalid string: " + s);
        }
    }

    public static void checkPositive(int n) {
        if (!ValidationHelper.isPositive(n)) {
            throw new IllegalArgumentException("Number must be positive: " + n);
        }
    }

    public static void checkPositiveDouble(double n) {
        if (!ValidationHelper.isPositiveDouble(n)) {
            throw new IllegalArgumentException("Value must be > 0: " + n);
        }
    }
}
