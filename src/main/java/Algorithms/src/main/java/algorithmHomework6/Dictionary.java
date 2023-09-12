package algorithmHomework6;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dictionary {
    public static Map<Character, Integer> rusDictionary(String rusText) {
        rusText = rusText.toLowerCase();
        Pattern pattern = Pattern.compile("[а-я]");
        Matcher matcher = pattern.matcher(rusText);

        Map<Character, Integer> frequencyDict = new HashMap<>();

        while (matcher.find()) {
            char letter = matcher.group().charAt(0);
            frequencyDict.put(letter, frequencyDict.getOrDefault(letter, 0) + 1);
        }
        return frequencyDict;
    }
    public static Map<Character, Integer> engDictionary(String engText) {
        engText = engText.toLowerCase();
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(engText);

        Map<Character, Integer> frequencyDict = new HashMap<>();

        while (matcher.find()) {
            char letter = matcher.group().charAt(0);
            frequencyDict.put(letter, frequencyDict.getOrDefault(letter, 0) + 1);
        }
        return frequencyDict;
    }
}
