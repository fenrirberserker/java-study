package tools;

import java.awt.*;

public class Nonblocking {
    public static final int SLEEP_MILLIS = 60*10;

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        int one =1;
        while (true) {
            Point point = MouseInfo.getPointerInfo().getLocation();
            one *= -1;
            robot.mouseMove(point.x, point.y+one);
            System.out.println("Mouse Moved!!");
            Thread.sleep(SLEEP_MILLIS);
        }
    }
}
