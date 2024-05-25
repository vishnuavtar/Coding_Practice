package INterview;

import java.util.HashMap;
import java.util.Map;

public class StringPairCounter {
    public static void main(String[] args) {
        String sentence = "I love programming. Programming is fun.";
        String string1 = "programming";
        String string2 = "is";

        int pairCount = countStringPairs(sentence, string1, string2);
        System.out.println("Number of occurrences: " + pairCount);
    }

    public static int countStringPairs(String sentence, String string1, String string2) {
        String[] words = sentence.split(" ");
        Map<String, Integer> pairCountMap = new HashMap<>();

        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equalsIgnoreCase(string1) && words[i + 1].equalsIgnoreCase(string2)) {
                String pair = words[i] + " " + words[i + 1];
                pairCountMap.put(pair, pairCountMap.getOrDefault(pair, 0) + 1);
            }
        }

        int pairCount = 0;
        for (int count : pairCountMap.values()) {
            pairCount += count;
        }

        return pairCount;
    }
}
