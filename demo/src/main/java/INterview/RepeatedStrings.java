package INterview;
import java.util.HashMap;
import java.util.Map;

public class RepeatedStrings {
    public static void main(String[] args) {
        String sentence = "This is a test sentence. This is another test sentence.";

        Map<String, Integer> stringOccurrences = new HashMap<>();

        // Split the sentence into individual words
        String[] words = sentence.split(" ");

        // Count the occurrences of each word
        for (String word : words) {
            // Convert the word to lowercase to consider case-insensitive matches
            String lowercaseWord = word.toLowerCase();

            // If the word is already present in the map, increment its count
            if (stringOccurrences.containsKey(lowercaseWord)) {
                int count = stringOccurrences.get(lowercaseWord);
                stringOccurrences.put(lowercaseWord, count + 1);
            } else {
                // Otherwise, add the word to the map with an initial count of 1
                stringOccurrences.put(lowercaseWord, 1);
            }
        }

        // Print repeated strings
        System.out.println("Repeated Strings:");
        for (Map.Entry<String, Integer> entry : stringOccurrences.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

        // Print non-repeated strings
        System.out.println("\nNon-repeated Strings:");
        for (Map.Entry<String, Integer> entry : stringOccurrences.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
