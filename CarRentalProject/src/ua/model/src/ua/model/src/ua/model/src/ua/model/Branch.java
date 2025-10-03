package ua.model;

public record Branch(String name, String location) {
    public Branch {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Branch name required");
        if (location == null || location.isBlank()) throw new IllegalArgumentException("Location required");
    }

    public static Branch of(String name, String location) {
        return new Branch(name, location);
    }
}

