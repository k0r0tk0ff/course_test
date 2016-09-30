package ru.parsentev.TEST;

//import java.util.Arrays;

import ru.parsentev.task_008.Primes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by root on 9/26/16.
 */

/** public class TEST {

    private final String line;

    public TEST(final String line) {
        this.line = line;
    }

    public int unique() {

        //int unique_char_count = 0;

        int input_string_lenght = line.length();

        int[] count_of_repeat_char = new int[input_string_lenght];

        char[] char_array_from_string = new char[line.length()];

        char_array_from_string = line.toCharArray();

        ArrayList<Character> buffer = new ArrayList<>();
        for(char buffered_char: char_array_from_string){
            buffer.add(buffered_char);
        }


        for(int i=0; i<input_string_lenght; i++){
            for(int j=1; j<input_string_lenght; j++){
                if(buffer.get(i) == buffer.get(j)){
                    count_of_repeat_char[i]++;
                    input_string_lenght--;
                    buffer.remove(j);
                }//else {
                 //   unique_char_count++;
                }
            }

        return input_string_lenght;
        }

    public static void main(String[] arg){

        TEST test = new TEST("aaab");
        System.out.println(test.unique());
    }

}


*/





/**
    Primes primes = new Primes(10);
    List<Integer> result = primes.calc();

    String buffer = "";

for (Integer item: result)
        {
        buffer = buffer + item + " ";
        }

        System.out.println(buffer);

        System.out.println(asList(result));

 */

