package ru.parsentev.task_003;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

//import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Triangle {
//    private static final Logger log = getLogger(Triangle.class);
    double first_lenght = 0.0;
    double second_lenght = 0.0;
    double third_lenght = 0.0;
    double p = 0.0;

    protected Point first = new Point(0, 3);
    protected Point second = new Point(4, 0);
    protected Point third = new Point(0, 0);

    //Point first = new Point(0, 0);

    public Triangle(final Point first, final Point second, final Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean exists(){
        boolean inLine_x = false;
        boolean inLine_y = false;
        boolean inPoint = false;
        boolean exit = true;


        inLine_x = ((first.x == second.x) && (first.x == third.x) && (second.x == third.x));
        inLine_y = ((first.y == second.y) && (first.y == third.y) && (second.y == third.y));

        inPoint = ((first.x == second.x) && (first.x == third.x) && (second.x == third.x) &&
                    (first.y == second.y) && (first.y == third.y) && (second.y == third.y));

        if(inLine_x || inLine_y || inPoint) {exit = false;}
        //if(inLine_y) {exit = false;}
        //if(inPoint)  {exit = false;}

        return exit;
    }

    public double area() {

        if (exists()==false) throw new IllegalStateException();
        first_lenght = first.distanceTo(second);
        second_lenght = second.distanceTo(third);
        third_lenght = third.distanceTo(first);

        p = (first_lenght + second_lenght + third_lenght) / 2;

        return Math.round(Math.sqrt(p * (p - first_lenght) * (p - second_lenght) * (p - third_lenght)));
    }
}


