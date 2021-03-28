package HW_210402;

import HW_210402.IHand.*;
import HW_210402.IHead.*;
import HW_210402.ILeg.*;

public class Run {
    public static void main(String[] args) {
        IRobot[] robot = new IRobot[3];
        robot[0] = new Robot(new SamsungHead(650), new AppleHand(620), new FoxconnLeg(460));
        robot[1] = new Robot(new AppleHead(890), new FoxconnHand(460), new SamsungLeg(410));
        robot[2] = new Robot(new FoxconnHead(610), new SamsungHand(430), new AppleLeg(490));

        robot[0].action();
        robot[1].action();
        robot[2].action();

        //Вычисляем самого дорогого робота
        int numberRobot = 0;
        int priceRobot = 0;
        for (int i = 0; i < robot.length; i++) {
            if (robot[i].getPrice() > priceRobot) {
                priceRobot = robot[i].getPrice();
                numberRobot = i;
            }
        }
        System.out.printf("Robot %d with a cost of %d is the most expensive.", numberRobot, priceRobot);
    }
}
