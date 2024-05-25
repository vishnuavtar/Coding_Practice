package Array71;
import java.util.Arrays;

public class ArraySumUsingStream {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Using IntStream and sum() method
        int sum = Arrays.stream(array).sum();

        System.out.println("Sum of array elements: " + sum);
    }
}
