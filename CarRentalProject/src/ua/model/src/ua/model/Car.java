package ua.model;

import ua.model.enums.CarStatus;
import java.util.Objects;

public class Car {
    private String licensePlate;
    private String model;
    private int year;
    private int mileage;
    private CarStatus status;

    public Car(String licensePlate, String model, int year, int mileage, CarStatus status) {
        if (licensePlate == null || licensePlate.isBlank()) throw new IllegalArgumentException("Invalid license plate");
        if (model == null || model.isBlank()) throw new IllegalArgumentException("Invalid model");
        if (year < 1900 || year > 2100) throw new IllegalArgumentException("Invalid year");
        if (mileage < 0) throw new IllegalArgumentException("Mileage cannot be negative");

        this.licensePlate = licensePlate;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.status = status;
    }

    public static Car of(String licensePlate, String model, int year, int mileage, CarStatus status) {
        return new Car(licensePlate, model, year, mileage, status);
    }

    public String getLicensePlate() { return licensePlate; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public int getMileage() { return mileage; }
    public CarStatus getStatus() { return status; }

    public void setMileage(int mileage) {
        if (mileage < 0) throw new IllegalArgumentException("Mileage cannot be negative");
        this.mileage = mileage;
    }

    public void setStatus(CarStatus status) { this.status = status; }

    @Override
    public String toString() {
        return String.format("Car[%s, %s, %d, %d km, %s]", licensePlate, model, year, mileage, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(licensePlate, car.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate);
    }
}
