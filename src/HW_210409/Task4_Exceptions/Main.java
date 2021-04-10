package HW_210409.Task4_Exceptions;

public class Main{
    public static void main(String[] args) {
        Car[] car = new Car[4];
        car[0] = new Car();
        car[1] = new Car("Citroen C2", 195, 160000);
        car[2] = new Car("Skoda Fabia RS", 226, 235000);
        car[3] = new Car("Fiat Grande Punto", 165, 126000);

        StartedAllCars.startedAllCars(car);
    }
}

class StartedAllCars {
    public static void startedAllCars(Car[] cars) {
        int noStartedCars = howManyNotStartingCars(cars);
        while (noStartedCars != 0) {
            try {
                for (Car i : cars) {
                    i.start();
                }
            } catch (EngineFailureException e) {
                System.out.println(e.getMessage());
            }
            noStartedCars = howManyNotStartingCars(cars);
        }
    }

    private static int howManyNotStartingCars (Car[] cars) {
        int a = 0;
        for (Car car : cars) {
            if (!car.isEngineStarted()) {
                a++;
            }
        }
        return a;
    }
}
