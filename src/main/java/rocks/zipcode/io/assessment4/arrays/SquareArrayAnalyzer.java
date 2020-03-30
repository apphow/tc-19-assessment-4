package rocks.zipcode.io.assessment4.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {

        Arrays.sort(inputArray);
        Arrays.sort(squaredValues);

        int counter = 1;
        int counter2 = 1;
        for (int i = 0; i < inputArray.length; i++) {
            counter += inputArray[i];
            for (int j = 0; j < squaredValues.length; j++) {
                counter2 = squaredValues[j];
            }
            if (counter == counter2 * counter2) {
                return false;
            }
        }
        return true;
    }
}

