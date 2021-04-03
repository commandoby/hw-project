package HW_210409.Task1_Сallback;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        TimeObject timer = new TimeObject(new WaitTimer());
        int pos = 0;
        while (true) {
            timer.act(10);
            //System.out.println("It took 10 seconds.");
            pos++;
            TimerFrame frame = new TimerFrame(new Frame("Timer window"), pos*15, pos*10);
        }
    }
}

class TimeObject {
    Timer timer;

    public TimeObject(Timer timer) {
        this.timer = timer;
    }

    public void act(int second) {
        timer.act(second);
    }
}

interface Timer {
    void act(int second);
}

class WaitTimer implements Timer {

    @Override
    public void act(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

