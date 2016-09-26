package ru.parsentev.task_006;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;
import static java.lang.Math.abs;

//import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @author k0r0tk0ff
 *
 * @since 25.09.2016
 */
public class Square {
    //private static final Logger log = getLogger(Square.class);

    private final Point first;
    private final Point second;
    private final Point third;
    private final Point fourth;

    public Square(final Point first, final Point second, final Point third, final Point fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;


    }

    public boolean exists() {

        boolean exit = false;

        double a = Math.abs(first.distanceTo(second));
        double b = Math.abs(second.distanceTo(third));
        double c = Math.abs(fourth.distanceTo(third));
        double d = Math.abs(first.distanceTo(fourth));

        if((a == b) && (a == c) && (a == d)) exit = true;
        return exit;

    }
}
