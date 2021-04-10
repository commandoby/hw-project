package HW_210409.Task4_Exceptions;

import java.util.Random;

public class Car {

    private String model;
    private int maxSpeed;
    private int price;
    private boolean engineStarted = false;

    public Car() {
        model = "Volkswagen Golf III";
        maxSpeed = 168;
        price = 68600;
    }

    public Car(String model, int maxSpeed, int price) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public void start() throws EngineFailureException {
        if (!engineStarted) {
            Random random = new Random();
            if (random.nextInt(20) % 2 != 0) {
                engineStarted = true;
                System.out.println(model + " started up.");
            } else {
                throw new EngineFailureException(model + " engine will not start.");
            }
        }
    }
}
