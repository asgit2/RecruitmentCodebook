package SAS;

import java.util.*;
import java.util.stream.Collectors;
class Solutions {
    public static void main(String[] args) {
        String[] input = {"eat","tea","tan","ate","bat","tab"};
        Map<String, List<String>> res = Arrays.stream(input)
                                        .collect(Collectors.groupingBy(
                                            word -> {
                                                char[] ch = word.toCharArray();
                                                Arrays.sort(ch);
                                                return new String(ch);
                                            }
                                            ));
            res.values().forEach(System.out::println);
    }
}

//Input: ["eat","tea","tan","ate","bat","tab"]
//output: [["bat","tab"],["tan"],["ate","eat","tea"]]