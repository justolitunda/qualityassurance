package ac.ke.egerton.egerton.model.enumerated;

public enum YesNo {
    YES("YES"), NO("NO");

    private final String yesNo;

    YesNo(String yesNo) {
        this.yesNo = yesNo;
    }

    public String getYesNo() {
        return yesNo;
    }
}
