package ru.parsentev.task_001;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

//import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author parsentev
 * @since 18.07.2016
 */



public class Calculator {
    //private static final Logger log = getLogger(Calculator.class);

    public double Result = 0.0;

    public double getResult() {
        return Result;
    }

    public void add(double first, double second) {
        Result = first + second;
    }

    public void substract(double first, double second) {
        Result = first - second;
    }

    public void multiple(double first, double second) {
        Result = first * second;
    }

    public void div(double first, double second) {
        if(second == 0) throw new IllegalStateException();
        Result = first / second;
    }

    public void expand(double first, double second) {
        double expand_value = 1.0;
        if(second == 0) expand_value = 1.0;
        else if(second == 1) expand_value = first;
        else {
            for (int i=0; i < second; i++){
                expand_value = expand_value * first;
            }
        }
        Result = expand_value;
    }

}

