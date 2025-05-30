public enum RamType {

    DDR2("RAM type DDR2"),
    DDR3("RAM type DDR3"),
    DDR4("RAM type DDR4"),
    DDR5("RAM type DDR5"),;

    private String value;
    RamType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
