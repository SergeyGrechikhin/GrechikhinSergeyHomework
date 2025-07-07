package javapro.homework8.task1;

import java.util.*;

public class WordsGroup {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("Bread");
        words.add("Fish");
        words.add("Cat");
        words.add("Sheep");
        words.add("Book");
        Map<Character, List<String>> grouped  = new TreeMap<>();

        for(String word : words){
            char ch = word.charAt(0);
            List<String> wordList = grouped.get(ch);

            if (wordList == null){
                wordList = new ArrayList<>();
                grouped.put(ch, wordList);
            }

            wordList.add(word);
        }
        for (Map.Entry<Character, List<String>> entry : grouped.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
