package pattern.factory;

public class Memory {
    private final int volume;
    private final int frequency;

    public int getVolume() {
        return volume;
    }

    public int getFrequency() {
        return frequency;
    }

    public Memory(int volume, int frequency) {
        this.volume = volume;
        this.frequency = frequency;
    }
}
