package ac.ke.egerton.egerton.model.enumerated;

public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE");

    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
