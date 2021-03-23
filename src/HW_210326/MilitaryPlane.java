package HW_210326;

public class MilitaryPlane extends AirTransport {
    private boolean ejectionSystem;
    private int numberOfMissiles;

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    public MilitaryPlane(int power, int maximumSpeed, int weight, String model, int wingspan, int minimumRunwayLength,
                         boolean ejectionSystem, int numberOfMissiles) {
        super(power, maximumSpeed, weight, model, wingspan, minimumRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.numberOfMissiles = numberOfMissiles;
    }

    @Override
    public void info() {
        System.out.printf("""
                        Военный самолёт марки %s имеет следующие характеристики:
                         - Мощность самолёта равна %d лс (%.2f кВт);
                         - Размах крыльев самолёта равен %d м;
                         - При массе %d кг, самолёту необходимо %d м полосы для взлёта;
                         - Максимальная скорость самолёта составляет %d км/ч;
                         - Количество ракет на борту - %d, система катапультирования""",
                model, power, powerTransfer(), wingspan, weight, minimumRunwayLength, maximumSpeed,
                numberOfMissiles);
        if (ejectionSystem) {
            System.out.println(" присутствует.");
        } else {
            System.out.println(" отсутствует.");
        }
    }

    public void shot() {
        if (numberOfMissiles > 0) {
            numberOfMissiles--;
            System.out.println("Ракета пошла.");
        } else {
            System.out.println("Боеприпасы отсутствуют.");
        }
    }

    public void ejection() {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно.");
        } else {
            System.out.println("У вас нет такой систвемы.");
        }
    }
}
