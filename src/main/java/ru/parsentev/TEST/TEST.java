package ru.parsentev.TEST;

//import java.util.Arrays;

import ru.parsentev.task_008.Primes;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by root on 9/26/16.
 */
public class TEST {

    public static void main(String[] arg){

        Primes primes = new Primes(10);
        List<Integer> result = primes.calc();

        String buffer = "";

        for (Integer item: result)
        {
            buffer = buffer + item + " ";
        }

        System.out.println(buffer);

        System.out.println(asList(result));

    }
}




