package HW_210423.Task4;

import java.io.*;
import java.util.ArrayList;

public class ApplicationTask4 {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\HW_210423\\Task4\\CarList.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\HW_210423\\Task4\\CarList.txt"))) {
            ArrayList<Car> carList = new ArrayList<>();
            ArrayList<Car> newCarList = new ArrayList<>();

            carList.add(new Car("Citroen C2", 195, 160000));
            carList.add(new Car("Skoda Fabia RS", 226, 235000));
            carList.add(new Car("Fiat Grande Punto", 165, 126000));

            for (Car car : carList) {
                oos.writeObject(car);
            }

            for (int i = 0; i < carList.size(); i++) {
                newCarList.add((Car) ois.readObject());
            }

            for (Car car : newCarList) {
                System.out.println(car.toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
