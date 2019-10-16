package Advanced_Level2;

import Basic_Level.WordCount;

public class SplitWords {
    public SplitWords() {
    }

    public static String[] returnWords(String myText) {
        String[] words = myText.replaceAll("[!?.,]", "").split("[\\s+]");

        for(int i = 0; i < words.length; ++i) {
            if (words[i].equals(",") || words[i].equals(".") || words[i].equals("!") || words[i].equals("?") || words[i].equals("...")) {
                words = WordCount.removeTheElement(words, i);
                --i;
            }
        }

        return words;
    }
}