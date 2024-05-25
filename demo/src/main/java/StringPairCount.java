import java.util.HashMap;
import java.util.Map;

public class StringPairCount {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "apple", "orange", "banana", "orange", "apple", "grape"};

        Map<String, Integer> pairCountMap = countStringPairs(strings);

        // Display the counts
        for (Map.Entry<String, Integer> entry : pairCountMap.entrySet()) {
            System.out.println("Pair: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

    public static Map<String, Integer> countStringPairs(String[] strings) {
        Map<String, Integer> pairCountMap = new HashMap<>();

        for (int i = 0; i < strings.length - 1; i++) {
            String pair = strings[i] + ", " + strings[i + 1];
            pairCountMap.put(pair, pairCountMap.getOrDefault(pair, 0) + 1);
        }

        return pairCountMap;
        
        
    }
}
