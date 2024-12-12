import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {
    public static Map<Character, Integer> countFrequencies(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();


        for (char ch : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        String input = "Привіт, як справи?";
        Map<Character, Integer> frequencies = countFrequencies(input);
        System.out.println("Частота символів:");
        frequencies.forEach((key, value) -> System.out.println("'" + key + "' : " + value));
    }
}
