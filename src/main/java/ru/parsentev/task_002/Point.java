package ru.parsentev.task_002;

//import org.slf4j.Logger;

//import static org.slf4j.LoggerFactory.getLogger;

/**
 * Class Point defines a point in coordination system (x, y).
 * @author parsentev
 * @since 19.07.2016
 */
public class Point {
    //private static final Logger log = getLogger(Point.class);

    public final int x;
    public final int y;

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(final Point point) {
        return Math.sqrt((point.x - x)*(point.x - x) + (point.y - y)*(point.y - y));
    }
}
