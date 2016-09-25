package ru.parsentev.task_005;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;
import ru.parsentev.task_003.Triangle;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author parsentev
 * @since 28.07.2016
 */
public class RightTriangle extends Triangle {
    //private static final Logger log = getLogger(RightTriangle.class);

    public RightTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        boolean exit = false;
        double a = Math.abs(first.distanceTo(second));
        double b = Math.abs(second.distanceTo(third));
        double c = Math.abs(first.distanceTo(third));

        if(c == Math.sqrt((Math.pow(a, 2.0) + Math.pow(a, 2.0))) ||
                b == Math.sqrt((Math.pow(c, 2.0) + Math.pow(a, 2.0))) ||
                     a == Math.sqrt((Math.pow(b, 2.0) + Math.pow(c, 2.0))))
        { exit = true;}
        return exit;
    }
}
