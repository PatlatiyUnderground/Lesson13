package computer.cpu;

public enum Power {
    LOW("Cpu power Low"),
    MEDIUM("Cpu power Medium"),
    HIGH("Cpu power High"),;

    private String value;
    Power(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
