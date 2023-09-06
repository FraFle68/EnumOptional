public enum DaysOfWeek {
    MONDAY("Montag"),
    TUESDAY("Dienstag"),
    WEDNESDAY("Mittwoch"),
    THURSDAY("Donnerstag"),
    FRIDAY("Freitag"),
    SATURDAY("Samstag"),
    SUNDAY("Sonntag");

    private final String german;
    DaysOfWeek(String german) {
        this.german=german;
    }

    public String getWorkday() {
        String workday = german;
        if(workday.equals(DaysOfWeek.SATURDAY.german) || workday.equals(DaysOfWeek.SUNDAY.german)) {
            workday = "Wochenende";
        }
        return workday;
    }
}


