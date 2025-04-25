public enum Role {
    ADMIN("Admin User"),
    USER("Regular User");

    private String description;

    Role(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}