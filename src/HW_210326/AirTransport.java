package HW_210326;

public abstract class AirTransport extends Transport {
    protected int wingspan; //meter
    protected int minimumRunwayLength; //meter

    public AirTransport(int power, int maximumSpeed, int weight, String model, int wingspan, int minimumRunwayLength) {
        super(power, maximumSpeed, weight, model);
        this.wingspan = wingspan;
        this.minimumRunwayLength = minimumRunwayLength;
    }
}
