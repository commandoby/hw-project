package HW_210326;

public class FreightTransport extends LandTransport {
    private double liftingCapacity; //tons

    public void setLiftingCapacity(double liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }

    public FreightTransport(int power, int maximumSpeed, int weight, String model, int numberOfWheels,
                            double fuelConsumption, double liftingCapacity) {
        super(power, maximumSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void info() {
        System.out.printf("""
                        Грузовик марки %s имеет следующие характеристики:
                         - Мощность грузовика равна %d лс (%.2f кВт);
                         - При массе %d кг, грузовик имеет расход %.1f литра на 100 км;
                         - Грузовик имеет %d колес(а) и обладает максимальной грузоподъёмностью %.1f тонн;
                         - Максимальная скорость %d км/ч
                        """,
                model, power, powerTransfer(), weight, fuelConsumption, numberOfWheels,
                liftingCapacity, maximumSpeed);
    }

    public void loadTrack (double cargo) {
        if (cargo <= getLiftingCapacity()) {
            System.out.println("Грузовик загружен. =)");
        } else {
            System.out.println("Вам нужен грузовик побольше.");
        }
    }
}
