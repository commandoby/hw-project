package HW_210326;

public class LightTransport extends LandTransport {
    private String bodyType;
    private short numberOfPassengers;

    public String getBodyType() {
        return bodyType;
    }

    public short getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setNumberOfPassengers(short numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public LightTransport(int power, int maximumSpeed, int weight, String model, int numberOfWheels,
                          double fuelConsumption, String bodyType, int numberOfPassengers) {
        super(power, maximumSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = (short) numberOfPassengers;
    }

    @Override
    public void info() {
        System.out.printf("""
                        Легковой автомобиль марки %s имеет следующие характеристики:
                         - Мощность автомобиля равна %d лс (%.2f кВт);
                         - При массе %d кг, автомобиль имеет расход %.1f литра на 100 км;
                         - Исполнение копуса %s без туда позволяет вмещать %d пассажиров;
                         - Автомобиль имеет %d колес(а);
                         - Максимальная скорость %d км/ч
                        """,
                model, power, powerTransfer(), weight, fuelConsumption, bodyType, numberOfPassengers,
                numberOfWheels, maximumSpeed);
    }

    double consumedFuel(double distance) {
        return distance / 100 * fuelConsumption;
    }

    public void distance(double time) {
        double distance = maximumSpeed * time;
        System.out.printf("Автомобиль %s с максимальной скоростью %d км/ч за %.1f часа " +
                        "проедет %.1f км и израсходует %.1f л топлива.\n",
                model, maximumSpeed, time, distance, consumedFuel(distance));
    }
}
