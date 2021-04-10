package HW_210409.Task1_Сallback;

import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TimerFrame {
    Frame frame;

    public TimerFrame(Frame frame, int x, int y) {
        this.frame = frame;
        frame.setBounds(x, y, 280, 100);
        frame.add(new Text());
        frame.setVisible(true);
        frame.addWindowListener(new WindowClosingAdapter());
    }
}

class Text extends Canvas {
    @Override
    public void paint(Graphics g) {
        g.drawString("It took 10 seconds.", 5, 15);
    }
}

class WindowClosingAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        ((Window) e.getSource()).dispose();
    }
}
