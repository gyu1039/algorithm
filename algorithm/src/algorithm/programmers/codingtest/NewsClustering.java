package algorithm.programmers.codingtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NewsClustering {

    public int solution(String str1, String str2) {

        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for(int i=0; i<=str1.length()-2; i++) {
            char c1 = str1.charAt(i);
            char c2 = str1.charAt(i+1);

            if(Character.isAlphabetic(c1) && Character.isAlphabetic(c2)) {
                l1.add(str1.substring(i, i+2));
            }
        }

        for(int i=0; i<=str2.length()-2; i++) {
            char c1 = str2.charAt(i);
            char c2 = str2.charAt(i+1);

            if(Character.isAlphabetic(c1) && Character.isAlphabetic(c2)) {
                l2 .add(str2.substring(i, i+2));
            }
        }


        int dividend = 0;
        List<String> union = new ArrayList<>();
        List<String> intersection = new ArrayList<>();

        for(String s : l1) {
            if(l2.contains(s)) {
                intersection.add(s);
                union.add(s);
                l2.remove(s);
            } else {
                union.add(s);
            }
        }

        for(String s : l2) {
            union.add(s);
        }

        return (intersection.size() == 0 && union.size() == 0) ? 65536 :
                (int)(intersection.size() / (double)(union.size()) * 65536);
    }

    private static final Integer MULTIPLIER = Character.MAX_VALUE + 1;

    public static int anotherWay(String str1, String str2) {
        String word1 = str1.toLowerCase();
        String word2 = str2.toLowerCase();

        Map<String, Long> words1 = group(word1);
        Map<String, Long> words2 = group(word2);

        Integer intersection = getIntersection(words1, words2);
        Integer union = getUnion(words1, words2);

        if (intersection.equals(union) && union.equals(0)) {
            return MULTIPLIER;
        }

        return (int) (intersection.doubleValue() / union.doubleValue() * MULTIPLIER);
    }

    private static Map<String, Long> group(String word) {
        return IntStream.range(0, word.length() - 1)
                .mapToObj(index -> word.substring(index, index + 2))
                .filter(text -> text.chars().allMatch(character -> Character.isAlphabetic((char) character)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private static Integer getIntersection(Map<String, Long> words1, Map<String, Long> words2) {
        return words1.entrySet().stream()
                .filter(entry -> words2.containsKey(entry.getKey()))
                .map(entry -> Math.min(entry.getValue(), words2.get(entry.getKey())))
                .mapToInt(Long::intValue)
                .sum();
    }

    private static Integer getUnion(Map<String, Long> words1, Map<String, Long> words2) {
        Map<String, Long> copiedWords = new HashMap<>(words2);
        words1.forEach((key, value) -> copiedWords.put(key, Math.max(value, words2.getOrDefault(key, 0L))));

        return copiedWords.values().stream()
                .mapToInt(Long::intValue)
                .sum();

    }
}
