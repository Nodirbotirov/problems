package pattern.factory;

public class Disk {
    private final int volume;

    public Disk(int volume) {
        this.volume = volume;
    }

    private int getVolume(){
        return volume;
    }
}
