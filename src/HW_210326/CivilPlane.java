package HW_210326;

public class CivilPlane extends AirTransport {
    private int numberOfPassengers;
    private boolean businessClass;

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public CivilPlane(int power, int maximumSpeed, int weight, String model, int wingspan, int minimumRunwayLength,
                      int numberOfPassengers, boolean businessClass) {
        super(power, maximumSpeed, weight, model, wingspan, minimumRunwayLength);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    @Override
    public void info() {
        String on = (businessClass) ? "присутствует." : "отсутствует.";
        System.out.printf("""
                        Пассажирский самолёт марки %s имеет следующие характеристики:
                         - Мощность самолёта равна %d лс (%.2f кВт);
                         - Размах крыльев самолёта равен %d м;
                         - При массе %d кг, самолёту необходимо %d м полосы для взлёта;
                         - Максимальная скорость самолёта составляет %d км/ч;
                         - Количество мест на борту - %d, бизнес-класс %s
                         """,
                model, power, powerTransfer(), wingspan, weight, minimumRunwayLength, maximumSpeed,
                numberOfPassengers, on);
    }

    public void loadPlane(int passengers) {
        if (passengers <= numberOfPassengers) {
            System.out.println("Самолёт загружен. =)");
        } else {
            System.out.println("Выберите самолёт побольше.");
        }
    }
}
