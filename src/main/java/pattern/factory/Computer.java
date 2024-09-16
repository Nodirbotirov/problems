package pattern.factory;

public class Computer {

    private Disk storage;
    private Memory ram;
    private Motherboard motherboard;
    private Processor cpu;

    public Computer(Disk storage, Memory ram, Motherboard motherboard, Processor cpu) {
        this.storage = storage;
        this.ram = ram;
        this.motherboard = motherboard;
        this.cpu = cpu;
    }
}
