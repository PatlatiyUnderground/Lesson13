package computer.cpu;

public enum CpuCore {

    TWO("Cpu Core Two"),
    FOUR("Cpu Core Four"),
    SIX("Cpu Core Six"),
    EIGHT("Cpu Core Eight"),;

    private String value;
    CpuCore(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
