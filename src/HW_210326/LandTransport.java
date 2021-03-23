package HW_210326;

public abstract class LandTransport extends Transport {
    protected short numberOfWheels;
    protected double fuelConsumption; //liter/100km

    public LandTransport(int power, int maximumSpeed, int weight, String model, int numberOfWheels, double fuelConsumption) {
        super(power, maximumSpeed, weight, model);
        this.numberOfWheels = (short) numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }
}
