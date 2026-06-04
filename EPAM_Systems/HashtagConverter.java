package EPAM_Systems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HashtagConverter {
    public static String toHashtags(String sentence) {
        return Arrays.stream(sentence.trim().split("\\s+"))
                .filter(word -> !word.isEmpty())
                .map(word -> "#" + Character.toUpperCase(word.charAt(0))
                        + word.substring(1).toLowerCase())
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String input = "  convert    sentence to   hashtags in camel case  ";
        System.out.println(toHashtags(input));
    }
}
