package ua.model;

public record Branch(String name, String location) {

    public Branch {
        if (name == null || location == null) {
            throw new IllegalArgumentException("Branch fields cannot be null");
        }
    }

    @Override
    public String toString() {
        return "Branch[name=%s, location=%s]".formatted(name, location);
    }
}


