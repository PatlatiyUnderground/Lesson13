package computer.ram;

public enum RamType {

    DDR2("computer.ram.RAM type DDR2"),
    DDR3("computer.ram.RAM type DDR3"),
    DDR4("computer.ram.RAM type DDR4"),
    DDR5("computer.ram.RAM type DDR5"),;

    private String value;
    RamType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
