import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class AddressAnalyzer1 {
    public static void main(String[] args) {
        try {
            // Read the input file
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/names.csv"));
            String line;
            List<String[]> addresses = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                addresses.add(fields);
            }
            br.close();
            // Analyze the addresses
            Map<String, Map<String, List<String>>> cityData = new HashMap<>();
            for (String[] address : addresses) {
                String city = address[2].trim();
                String locality = address[3].trim();
                String postalCode = address[4].trim();
                Map<String, List<String>> localityData = cityData.computeIfAbsent(city, k -> new HashMap<>());
                List<String> postalCodes = localityData.computeIfAbsent(locality, k -> new ArrayList<>());
                postalCodes.add(postalCode);
            }
            // Write the output file
            FileWriter fw = new FileWriter("address-analysis.csv");
            fw.write("City,State,Most Common Locality,Postal Code Ranges\n");
            for (String city : cityData.keySet()) {
                Map<String, List<String>> localityData = cityData.get(city);
                String state = addresses.stream().filter(a -> a[0].trim().equals(city)).findFirst().get()[0].trim();
                String mostCommonLocality = "";
                int maxCount = 0;
                List<String> postalCodeRanges = new ArrayList<>();
                for (String locality : localityData.keySet()) {
                    List<String> postalCodes = localityData.get(locality);
                    int count = postalCodes.size();
                    if (count > maxCount) {
                        mostCommonLocality = locality;
                        maxCount = count;
                    }
                    String postalCodeRange = postalCodes.stream().distinct().sorted()
                            .reduce((prev, curr) -> Integer.parseInt(prev) + 1 == Integer.parseInt(curr) ? curr : prev + "-" + curr).get();
                    postalCodeRanges.add(locality + ":" + postalCodeRange);
                }
                String postalCodeRangesStr = String.join(", ", postalCodeRanges);
                fw.write(city + "," + state + "," + mostCommonLocality + "," + postalCodeRangesStr + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}