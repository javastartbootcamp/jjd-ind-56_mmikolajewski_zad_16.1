package pl.javastart.task;

public enum Season {
    SPRING("Wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("Jesień", new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("Zima", new String[]{"grudzień", "styczeń", "luty" });

    private final String destription;
    private final String[] months;

    Season(String destription, String[] months) {
        this.destription = destription;
        this.months = months;
    }

    public String getDestription() {
        return destription;
    }

    public String[] getMonths() {
        return months;
    }
}