package collection.flowbosConverter.exceptions;

public class CRCFailedException extends ModbusStormException{
    public CRCFailedException() {
    }

    public CRCFailedException(String s) {
        super(s);
    }
}
