package ac.ke.egerton.egerton.model.enumerated;

public enum Role {
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_STUDENT("ROLE_STUDENT"),
    ROLE_QA("ROLE_BUGS"),
    ROLE_STAFF("ROLE_STAFF");


    private final String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

}
