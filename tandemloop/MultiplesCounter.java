/*Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9] */

import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        // Input list
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Create a map to store counts
        Map<Integer, Integer> countMap = new HashMap<>();

        // Initialize the map with keys 1 to 9
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Count multiples
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        // Print the result
        System.out.println("Output:");
        System.out.println(countMap);
    }
}
