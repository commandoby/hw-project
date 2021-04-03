package HW_210409.Task4_Exceptions;

public class Main {
    public static void main(String[] args) {
        Car[] car = new Car[4];
        car[0] = new Car();
        car[1] = new Car("Citroen C2", 195, 160000);
        car[2] = new Car("Skoda Fabia RS", 226, 235000);
        car[3] = new Car("Fiat Grande Punto", 165, 126000);

        for (Car i : car) {
            try {
                i.Start();
            } catch (EngineFailureException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
