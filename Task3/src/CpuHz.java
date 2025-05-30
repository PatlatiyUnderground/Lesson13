public enum CpuHz {
    LOW("Cpu Hz Low"),
    MEDIUM("Cpu Hz Medium"),
    HIGH("Cpu Hz High"),;

    private String value;
    CpuHz(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
