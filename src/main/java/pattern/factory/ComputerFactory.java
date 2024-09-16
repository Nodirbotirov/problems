package pattern.factory;

public class ComputerFactory {

    private ComputerFactory(){}
    private static ComputerFactory computerFactory;
    public static ComputerFactory getInstance(){
        if (computerFactory == null) {
            computerFactory = new ComputerFactory();
        }
        return computerFactory;
    }

    public Computer buildComputer(
            int storage,
            int memoryVolume, int memoryFrequency,
            String motherboardModel,
            String cpuModel
    ){
        return new Computer(
                new Disk(storage),
                new Memory(memoryVolume, memoryFrequency),
                new Motherboard(motherboardModel),
                new Processor(cpuModel)
        );
    }

}
