package ac.ke.egerton.egerton.model.enumerated;

public enum Campus {
    Njoro_Main_Campus("Njoro Main Campus"),
    Nakuru_Town_Campus("Nakuru Town Campus");

    private final String campus;

    Campus(String campus){
        this.campus = campus;
    }

    public String getCampus(){
        return this.campus;
    }
}
