package ru.parsentev.task_007;
import ru.parsentev.task_001.Calculator;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

//import static org.slf4j.LoggerFactory.getLogger;

import com.sun.org.apache.regexp.internal.RE;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Expression {
    //private static final Logger log = getLogger(Expression.class);

    private final String expr;

    public Expression(final String expr) {
        this.expr = expr;
    }


    public double calc() {

        double Result = 0.0;


        String myDelimiter = "\\+|\\-|\\*|\\/|exp";
        String WITH_DELIMITER = "((?<=%1$s)|(?=%1$s))";

        String[] aEach = expr.split(String.format(WITH_DELIMITER, myDelimiter));
        if(aEach.length != 3) throw new IllegalStateException();

        double first = Double.parseDouble(aEach[0]);
        double second = Double.parseDouble(aEach[2]);
        String entered_operation = aEach[1];

        Calculator calculator = new Calculator();

        switch (entered_operation){
            case "+":
                calculator.add(first, second);
                Result = calculator.getResult();
                break;
            case "-":
                calculator.substract(first, second);
                Result = calculator.getResult();
                break;
            case "*":
                calculator.multiple(first, second);
                Result = calculator.getResult();
                break;
            case "exp":
                calculator.expand(first, second);
                Result = calculator.getResult();
                break;
            case "/":
                try{
                    calculator.div(first, second);
                    Result = calculator.getResult();
                    if (second == 0.0) throw new IllegalStateException();
                } catch (IllegalStateException e) {
                    System.out.println(" div on 0 !!!");
                }
                break;
            default: System.out.println("\n Invalid entered operation");
                break;
        }
        return Result;
    }
}
