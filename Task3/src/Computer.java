import org.w3c.dom.ls.LSOutput;

public class Computer {


    public final String vendor = "Vendor test";
    public final String name = "Name test";

    CPU cpu = new CPU();
    HD hd = new HD();
    Keyboard keyboard = new Keyboard();
    RAM ram = new RAM();
    Screen screen = new Screen();

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HD getHd() {
        return hd;
    }

    public void setHd(HD hd) {
        this.hd = hd;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "vendor='" + vendor + '\'' +
                ", \nname='" + name + '\'' +
                ", \ncpu=" + cpu +
                ", \nhd=" + hd +
                ", \nkeyboard=" + keyboard +
                ", \nram=" + ram +
                ", \nscreen=" + screen +
                '}';

    }

    public double calculatorWeight() {
        double weightSum = cpu.getWeight() + ram.getWeight() +
                            hd.getWeight() + keyboard.getWeigth() + screen.getWeigth();
        return weightSum;



    }
}
