package computer.cpu;

public class CPU {

    private CpuHz cpuHz;
    private CpuCore cpuCore;
    private Power power;

    double weight = 1;

    public CPU() {
    }

    public double getWeight() {
        return weight;
    }

}
