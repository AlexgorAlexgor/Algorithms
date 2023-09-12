package algorithmLesson082223;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static algorithmLesson082223.Rotation.rotation;
public class Main {
    public static Map<Character, Integer> dictionary(String text) {
        text = text.toLowerCase();
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(text);

        Map<Character, Integer> frequencyDict = new HashMap<>();

        while (matcher.find()) {
            char letter = matcher.group().charAt(0);
            frequencyDict.put(letter, frequencyDict.getOrDefault(letter, 0) + 1);
        }
        return frequencyDict;
    }
    public static void main(String[] args) {

        String text = "The quick fox jumps over the lazy dog";
        System.out.println("#1.1_______text: " + text);
        Map<Character, Integer> frequency = dictionary(text);
        System.out.println(frequency);
        Rotation rotation = new Rotation();
        int[] numbers = {9, 10, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("#1.2____: " + Arrays.toString(numbers) + " Array is rotated " + rotation(numbers) + " times");

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        System.out.println("#3____: " + stack.items);
        System.out.println("#4_stack.search _: index(15) =" + stack.search(15));
        int x = stack.pop();
        System.out.println("#5 popped element _: " + x);
        System.out.println("#6 last element _: " + stack.peek());
        stack.clear();
        System.out.println("#7_stack.clear _: " + stack.items);
        System.out.println("#4.1_stack.search _: index(empty) =" + stack.search(5));
    }
}
        /*Result :
algorithmLesson082223.Main
#1.1_______text: The quick fox jumps over the lazy dog
{a=1, c=1, d=1, e=3, f=1, g=1, h=2, i=1, j=1, k=1, l=1, m=1, o=3, p=1, q=1, r=1, s=1, t=2, u=2, v=1, x=1, y=1, z=1}
#1.2____: [9, 10, 1, 2, 3, 4, 5, 6, 7, 8] Array is rotated 2 times
#3____: [5, 10, 15]
#4_stack.search _: index(15) =2
#5 popped element _: 15
#6 last element _: 10
#7_stack.clear _: []
#4.1_stack.search _: index(empty) =-1

Process finished with exit code 0*/
