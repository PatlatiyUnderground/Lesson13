public enum KeyboardType {

    MECHANICAL("MECHANICAL"),
    MEMBRANE("MEMBRANE"),;

    private String value;
    KeyboardType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
