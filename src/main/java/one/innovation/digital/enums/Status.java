package one.innovation.digital.enums;

public enum Status {
    OPEN(13, "Open"),
    CLOSED(14, "Closed");

    private int cod;
    private String text;

    Status(final int cod, final String text) {
        this.cod = cod;
        this.text = text;
    }

    public int getCod() {
        return cod;
    }

    public String getText() {
        return text;
    }
}
