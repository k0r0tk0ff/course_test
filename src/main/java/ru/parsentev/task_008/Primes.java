package ru.parsentev.task_008;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.util.ArrayList;

//import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Primes {
//    private static final Logger log = getLogger(Primes.class);

    private final int limit;
    private int buffer;

    public Primes(final int limit) {
        this.limit = limit;
    }

    public ArrayList<Integer> calc() {
        ArrayList<Integer> exit_list = new ArrayList<>(limit);
        if(limit == 0) exit_list.add(1);
        if(limit == 1) {exit_list.add(1);}
        if(limit == 2) { exit_list.add(1); exit_list.add(2);}

        if(limit>2) { exit_list.add(1); exit_list.add(2);
            for (int i = 2; i < limit; i++) {
                buffer = exit_list.get(i-1) + exit_list.get(i-2);
                exit_list.add(buffer);
            }
        }

        return exit_list;
    }
}
