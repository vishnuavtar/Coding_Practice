package MaxMinREpeatedValueInArray;
import java.util.*;

public class MostRepeatedValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5, 5, 5);

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int mostRepeatedValue = 0;
        int maxFrequency = 0;

        for (int number : numbers) { 
            int frequency = frequencyMap.getOrDefault(number, 0) + 1;
            frequencyMap.put(number, frequency);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostRepeatedValue = number;
            }
        }

        System.out.println("Most repeated value: " + mostRepeatedValue);
        System.out.println("Frequency: " + maxFrequency);
    }
}
