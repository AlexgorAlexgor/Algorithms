package algorithmHomework6;
/*
Постройте частотный словарь букв русского (или английского) алфавита.
        для решения можно использовать Array или HashMap ( на ваше усмотрение)..
        Пример:
        text = "Привет, как дела?"
        {'а': 2, 'в': 1, 'д': 1, 'е': 2,  'и': 1, 'к': 2, 'л': 1, 'п': 1, 'р': 1,  'т': 1,  'я': 1}
*/

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String engText = "The quick fox jumps over the lazy dog";
        System.out.println("#1 english text: " + engText);
        Map<Character, Integer> engFrequency = Dictionary.engDictionary(engText);
        System.out.println("#2 frequency in english text  : " + engFrequency);

        String rusText = "Привет, как дела?";
        System.out.println("#3 russian text: " + rusText);
        Map<Character, Integer> rusFrequency = Dictionary.rusDictionary(rusText);
        System.out.println("#4 frequency in russian text  : " + rusFrequency);
        /*
        Results:
  #1 english text: The quick fox jumps over the lazy dog
#2 frequency in english text  : {a=1, c=1, d=1, e=3, f=1, g=1, h=2, i=1, j=1, k=1, l=1, m=1, o=3, p=1, q=1, r=1, s=1, t=2, u=2, v=1, x=1, y=1, z=1}
#3 russian text: Привет, как дела?
#4 frequency in russian text  : {р=1, а=2, в=1, т=1, д=1, е=2, и=1, к=2, л=1, п=1}

        Process finished with exit code 0
        */
    }
}
