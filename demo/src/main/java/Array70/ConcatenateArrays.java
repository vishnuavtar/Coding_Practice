package Array70;
import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatenateArrays {
    public static void main(String[] args) {
        // Sample arrays
        Integer[] array1 = {10, 20, 30};
        Integer[] array2 = {10, 20, 30};

        // Concatenate arrays using Stream.concat
        Integer[] resultArray = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                                      .toArray(Integer[]::new);

        // Print the result
        System.out.println(Arrays.toString(resultArray));
    }
}
