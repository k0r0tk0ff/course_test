package ru.parsentev.task_009;

import java.util.ArrayList;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class UniqueChars {
    private final String line;

    public UniqueChars(final String line) {
        this.line = line;
    }

    public int unique() {

        int input_string_lenght = line.length();

        /**
         * array`s element counting from 0, bun count of unique is counting from 1
         *
         * +1 need for correct counting
         */
        int unique_char_count = line.length() + 1;

        /**
         * Separate string to char array
         */
        char[] char_array_from_string = line.toCharArray();

        /**
         * Convert to ArrayList for work with array's index
         */
        ArrayList<Character> buffer = new ArrayList<>();
        for(char buffered_char: char_array_from_string){
            buffer.add(buffered_char);
        }

        for(int i=0; i<input_string_lenght; i++){
            for(int j=1; j<input_string_lenght; j++){
                if(buffer.get(i).equals(buffer.get(j))){
                            buffer.remove(j);
                            unique_char_count--;
                            input_string_lenght--;
                }
            }
        }
        return unique_char_count;
    }
}
