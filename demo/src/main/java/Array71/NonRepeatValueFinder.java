package Array71;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatValueFinder {

    public static int findNonRepeatValue(int[] array) {
        // Create a map with each element and its frequency
        Map<Integer, Long> frequencyMap = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Find the first element with frequency 1 (non-repeating)
        return Arrays.stream(array)
                .filter(element -> frequencyMap.get(element) == 1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No non-repeating element found"));
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4,1,2,3,4,5,6};
        int nonRepeatValue = findNonRepeatValue(array);
        System.out.println("Non-repeating value: " + nonRepeatValue);
    }
}
