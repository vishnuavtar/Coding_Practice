package Array71;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayUsingStream {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Using IntStream.range() to create a stream of indices in reverse order
        int[] reversedArray = IntStream.range(0, originalArray.length)
                .map(i -> originalArray[originalArray.length - 1 - i])
                .toArray();

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }
}
