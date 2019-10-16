package Advanced_Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class WordsOperations {
    public String text;

    public WordsOperations() {
    }

    public String mostOftenWords(String myText) {
        this.text = myText;
        String[] words = SplitWords.returnWords(myText);
        Map<String, Integer> map = new HashMap();
        List<String> outputArray = new ArrayList();
        String[] var5 = words;
        int var6 = words.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            String current = var5[var7];
            int count = (Integer)map.getOrDefault(current, 0);
            map.put(current, count + 1);
            outputArray.add(current);
        }

        Map<String, Integer> treeMap = (Map)map.entrySet().stream().sorted(Entry.comparingByValue()).collect(Collectors.toMap((e) -> {
            return (String)e.getKey();
        }, (e) -> {
            return (Integer)e.getValue();
        }, (e1, e2) -> {
            return e2;
        }, LinkedHashMap::new));
        List wordList = new ArrayList(treeMap.entrySet());
        List popularWords = wordList.subList(Math.max(wordList.size() - 5, 0), wordList.size());
        Collections.reverse(popularWords);
        System.out.println("The most frequent words: " + popularWords);
        return myText;
    }

    public String LongestWord(String myText) {
        int longest = 0;
        String longestWord = "";
        String[] words = SplitWords.returnWords(myText);
        String[] var5 = words;
        int var6 = words.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            String word = var5[var7];
            if (word.length() > longest) {
                longest = word.length();
                longestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord + " with length - " + longest);
        return myText;
    }
}
