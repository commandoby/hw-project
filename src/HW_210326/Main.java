package HW_210326;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Transport[] transport = new Transport[4];
        transport[0] = new LightTransport(300, 180, 2400, "Sitroen",
                4, 4.4, "sedan", 5);
        transport[1] = new FreightTransport(560, 140, 5600, "Maz",
                6, 8.2, 8.5);
        transport[2] = new CivilPlane(400, 320, 2100, "Cessna", 5,
                300, 4, false);
        transport[3] = new MilitaryPlane(650, 540, 3650, "Cy-27", 5,
                250, true, 8);

        //Операции с легковым авто
        transport[0].info();
        System.out.printf("Введите время в часах, которое будет ехать автомобиль %s: ", transport[0].model);
        ((LightTransport) transport[0]).distance(in.nextDouble());

        //Операции с грузовым авто
        System.out.println();
        transport[1].info();
        System.out.printf("Введите массу груза (тонн), которого необходимо загрузить в грузовик %s: ", transport[1].model);
        ((FreightTransport) transport[1]).loadTrack(in.nextDouble());

        //Операции с гражданским самолётом
        System.out.println();
        transport[2].info();
        System.out.printf("Введите число пассажиров для перелёта на самолёте %s: ", transport[2].model);
        ((CivilPlane) transport[2]).loadPlane(in.nextInt());

        //Операции с военным самолётом
        System.out.println();
        transport[3].info();
        ((MilitaryPlane) transport[3]).shot();
        ((MilitaryPlane) transport[3]).ejection();
    }
}
