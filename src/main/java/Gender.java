public enum Gender {
    MASCULIN("männlich"),
    FEMININ("weiblich"),
    DIVERS("divers");

    private final String german;
    Gender(String german) {
        this.german=german;
    }

    public String getGerman() {
        return german;
    }
}
