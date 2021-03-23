package HW_210326;

public abstract class AirTransport extends Transport {
    protected short wingspan; //meter
    protected short minimumRunwayLength; //meter

    public AirTransport(int power, int maximumSpeed, int weight, String model, int wingspan, int minimumRunwayLength) {
        super(power, maximumSpeed, weight, model);
        this.wingspan = (short) wingspan;
        this.minimumRunwayLength = (short) minimumRunwayLength;
    }
}
