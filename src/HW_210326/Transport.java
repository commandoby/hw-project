package HW_210326;

public abstract class Transport {
    protected int power; //hp
    protected int maximumSpeed; //km/h
    protected int weight; //kg
    protected String model;

    public Transport(int power, int maximumSpeed, int weight, String model) {
        this.power = power;
        this.maximumSpeed = maximumSpeed;
        this.weight = weight;
        this.model = model;
    }

    public abstract void info ();

    double powerTransfer() {
        return power / 0.74;
    }
}
